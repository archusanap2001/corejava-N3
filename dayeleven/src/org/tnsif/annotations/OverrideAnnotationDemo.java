package org.tnsif.annotations;

//program for @override annotation.
class parent{
	public void print() {
		System.out.println("parent class method");
	}
}
class child extends parent{
	@Override
	public void print() {
		System.out.println("parent class method");
	}
	
}
public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		parent p=new child();
		parent p1=new parent();
		p.print();
		p1.print();
		
		
	}

}
