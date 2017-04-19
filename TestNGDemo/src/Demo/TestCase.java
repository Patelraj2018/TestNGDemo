package Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
	   
	    @Test
	    public void f() {
	    	System.out.println("Raj");
	    }
	 
	    @BeforeTest
	    public void beforeTest() {
	    	System.out.println("Start");
	    	System.out.println("Stop");
	    }
	 
	    @AfterTest
	    public void afterTest() {
	    	
	    }

}
