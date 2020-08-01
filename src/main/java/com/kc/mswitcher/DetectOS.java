package com.kc.mswitcher;

public class DetectOS {

	public static String getOperatingSystem() {
        String os = System.getProperty("os.name");
        System.out.println("Using System Property: " + os);
        return os;
    }
	
	public static boolean isWindows() {
		return getOperatingSystem().indexOf("windows") !=-1;
	}

}
