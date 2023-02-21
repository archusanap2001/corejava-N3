package org.tnsif.threadlifecycle;
//to program to demstrate on thread lifecycle

public class Tech extends Thread{
	public void run()
	{
		System.out.println("Java Full Stack Training");
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			try
			{
				Thread.sleep(2000);
				
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
		
			}
			
		}
		System.out.println("Tech session");
	}
}


