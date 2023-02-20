package org.tnsif.annotations;

class DeprecatedDemo{
	@Deprecated
	//it is used to show any method or parameter,fields etc is unimportant.
	public void display() {
		
		System.out.println("deprecated annotation");
	}
}
public class DeprecatedAnnotationsDemo {

	public static void main(String[] args) {
	DeprecatedDemo d=new DeprecatedDemo(); 
	d.display();

	}

}

