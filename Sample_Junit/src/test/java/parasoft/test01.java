package parasoft;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
public class test01 {

	String message = "BrowserStack is the intended message";
	@Test 
	public void testMessage() {
	System.out. println("Inside testMessage()");
	assertEquals(message, "BrowserStack is the intended message");
	}
}
