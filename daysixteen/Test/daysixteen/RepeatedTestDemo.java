package daysixteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@Test
	@RepeatedTest(5)
	void test() {
		
		       
			System.out.println("Repeated Test Annotation");
		}
	

}
