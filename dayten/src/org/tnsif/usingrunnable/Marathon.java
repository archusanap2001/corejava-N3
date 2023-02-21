package org.tnsif.usingrunnable;

//program to demostrate on Runnable interface for a thread

public class Marathon implements Runnable{
	//private data member
	private int speed;
	private String City;
	
    //geeters and setters
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	@Override
	public void run() {
		System.out.println("Speed of a participate:" +speed + "The city is:" +City);
		
	}


}
