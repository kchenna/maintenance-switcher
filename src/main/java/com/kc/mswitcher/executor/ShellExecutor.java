package com.kc.mswitcher.executor;

import java.io.File;

import com.kc.mswitcher.DetectOS;

public class ShellExecutor {

	public boolean execute() throws Exception {
		boolean isWindows = DetectOS.isWindows();
		
		ProcessBuilder builder = new ProcessBuilder();
		if (isWindows) {
		    builder.command("cmd.exe", "/c", "dir");
		} else {
		    builder.command("sh", "-c", "ls -ltr");
		}
		
		builder.directory(new File(System.getProperty("user.home")));
		Process process = builder.start();
		StreamGobbler streamGobbler = 
		  new StreamGobbler(process.getInputStream(),System.out::println);
		new Thread(streamGobbler).start();
		
		//Executors.newSingleThreadExecutor().submit(streamGobbler);
		//Executors.newSingleThreadExecutor().shutdownNow();
		int exitCode = process.waitFor();
		return exitCode == 0;
	}
	
	
	public static void main(String[] args) throws Exception {
		ShellExecutor s = new ShellExecutor();
		System.out.println(s.execute());
	}
	
}
