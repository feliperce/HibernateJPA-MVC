package br.com.tupinikimtecnologia.utils;

public abstract class ThUtils {
	/**
	 * Sleep the thread in 2 seconds
	 */
	public static void  systemSleep(){
		try {
			System.out.println("Wait...");
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
