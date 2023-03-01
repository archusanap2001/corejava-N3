package daysixteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
//program to demonstrate on parameterized test
class ParameterizedTestDemo {


	@ParameterizedTest
	@ValueSource(strings={"Naina","Diya"})
	void test() {
		System.out.println("Hello.......");
		
	}
	@ParameterizedTest
	@ValueSource(strings={"Naina","Diya"})
	void display() {
		assertFalse("Naina"=="Diya");
		
	}

}
