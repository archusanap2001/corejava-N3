package org.tnsif.customexception;

public class loginCredential extends  Exception{
	private String str;
	

	public loginCredential(String str) {
		super();
		this.str = str;
	}
	
	@Override
	public String toString() {
		return "loginCredential [str=" + str + "]";
	}

}
