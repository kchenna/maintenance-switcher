package com.kc.mswitcher.service;

import org.springframework.stereotype.Service;

import com.kc.mswitcher.executor.ShellExecutor;

@Service
public class ShellExecutorService {

	public boolean execute() throws Exception {
		ShellExecutor exec = new ShellExecutor();
		return exec.execute();
	}
	
}
