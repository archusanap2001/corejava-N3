package org.tnsif.finalkeyword;

public class Pineapple extends Cake{
	private int price;
	//getters and setters
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//if any method is declarde as final in parent class the we cannot over
	/*void display(){
	 System.out.println();
	 }*/

	public void display (int price) 
	{
		System.out.println("the price is:"+price);
	}
	} 
	
	
	
