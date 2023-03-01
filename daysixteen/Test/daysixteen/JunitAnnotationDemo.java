package daysixteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

class JunitAnnotationDemo {

	@Test
	@DisplayName("SimpleJunitTestingMethod")
	static void test() {
		System.out.println("First Junit test case ");
	}
	@Test
	@BeforeAll
     static void display() {
		System.out.println("Welcome to junit5 testing ");
	}
    @Test
	@AfterEach
	@Disabled
    void accept() {
		System.out.println("After Each method demo ");
	
    }
    @Test
	@BeforeEach
    void run() {
		System.out.println("Before Each method demo ");
	
}

    
    @Test
	@AfterAll
        static void show() {
		System.out.println("After All method demo ");
	
}

}
