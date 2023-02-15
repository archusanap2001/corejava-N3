package org.tnsif.finalkeyword;

public class Cake {
	protected String flavour;
	
	//getters and setters
	public String getFlavour() {
		return flavour;
	}


	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

    //final method
	final void display()
	{
		System.out.println("flavour of a cake is:"+flavour);
	}
	
	

}
