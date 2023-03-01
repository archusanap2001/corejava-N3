package daysixteen;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//program to demonstrate on assertion annotations
class JunitAssertionDemo {

	@Test
	//Fails when expected does not equal actual
	void test() {
		assertEquals(12,12);
	}
	@Test
	//Fails when expression is true
	void display() {
		assertFalse(12==1);
	}

}

