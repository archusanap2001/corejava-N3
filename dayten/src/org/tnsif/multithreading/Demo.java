package org.tnsif.multithreading;

public class Demo {

	public static void main(String[] args) {
	Sender sender=new Sender();
	SendingUsingThreads sender1=new SendingUsingThreads("hello",sender);
	SendingUsingThreads sender2=new SendingUsingThreads("Welcome to java session ",sender);
	
	
	sender1.start();
	sender2.start();
	try {
		sender1.join();
		sender2.join();
		
	}
	catch(Exception e) {
		System.out.println("Interrupted");
		
	}

	
	}

}