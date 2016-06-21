package br.com.tupinikimtecnologia.utils;

public abstract class ThUtils {
	/**
	 * Sleep the thread in miliseconds
	 * @param ms miliseconds that thread will sleep
	 */
	public static void  systemSleep(int ms){
		try {
			System.out.println("Wait "+ms/1000+" seconds...");
			Thread.sleep(ms);
			System.out.println("Done!");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
