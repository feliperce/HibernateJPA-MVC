package br.com.tupinikimtecnologia.utils;

public abstract class ThUtils {
	/**
	 * Sleep the thread in 2 seconds
	 */
	public static void  systemSleep(){
		int ms = 2000;
		try {
			System.out.println("Wait "+ms/1000+" seconds...");
			Thread.sleep(ms);
			System.out.println("Done!");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
