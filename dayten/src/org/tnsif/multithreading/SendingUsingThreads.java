package org.tnsif.multithreading;

public class SendingUsingThreads extends Thread{
	private String message;
	Sender sender;
	SendingUsingThreads(String msg,Sender object){
		message=msg;
		sender=object;
		
	}
	public void run() {
		synchronized(sender) {
			sender.sendMessage(message);
			
		}
	}
}