package org.tnsif.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//custom annotations
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnotationDemo.class)
@interface CustomAnnotation{
	//abstract method
	String print() default"welcome to N3 batch";
	 int value() default 0;
	
	
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnotationDemo{
	CustomAnnotation[] value();
}


public class RetensionAnnotationDemo {
	@CustomAnnotation(print = "Retention Annotation Test",value=1)
	@CustomAnnotation(print = "Testing Annotation ",value=2)

	
//	public static void main(String[] args) {
//		RetensionAnnotationDemo r=new RetensionAnnotationDemo();
public static void testMethod() {
		RetensionAnnotationDemo r=new RetensionAnnotationDemo();
		try 
		{
		Class<?>c=r.getClass();
		Method m=c.getMethod("testMethod");
		Annotation a=m.getAnnotation(MyRepeatedAnnotationDemo.class);
		System.out.println(a);
	}
		catch(NoSuchMethodException e) {
			System.out.println(e);
		}
	}
	public static void main(String[]args) {
	testMethod();
}
}
