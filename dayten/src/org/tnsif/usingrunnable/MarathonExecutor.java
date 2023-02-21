package org.tnsif.usingrunnable;
//drive class
//program to demostrate on Runnable interface for a thread 
public class MarathonExecutor {

	public static void main(String[] args) {
		Marathon m=new Marathon();
		m.setSpeed(40);
		m.setCity("pune");
		m.run();

	}

}
