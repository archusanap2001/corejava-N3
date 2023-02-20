package org.tnsif.annotations;

	import java.beans.Customizer;
	import java.lang.annotation.Documented;
	import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;
	import java.lang.reflect.Method;

	//create custom annotation with multi value annotation
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	@interface custom{
		//abstract method
		String print() default "shraddha";
		int speed()default 80;
		float salary() default 75000.50f;
	}
	class CustomAnnotationClass{
		@custom(print="hello Guys!",speed=70,salary=6780.70f)
		public void display() {
			System.out.println("sunday is funday");
		}
	}
	public class CustomAnnotationDemo {

		public static void main(String[] args) throws NoSuchMethodException,Exception {
			CustomAnnotationClass c=new CustomAnnotationClass();
			c.display();
			Method m=c.getClass().getMethod("display");
			custom obj=m.getAnnotation(custom.class);
			System.out.println(obj.print());
			System.out.println(obj.speed());
			System.out.println(obj.salary());
			
			
			
			
		}

	}

