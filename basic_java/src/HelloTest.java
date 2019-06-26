import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	@Test public void 
	sayHi_with_somkiat_should_Hello_somkiat() {
		Hello h = new Hello();
		String actualResult = h.sayHi("somkiat");
		assertEquals("Hello somkiat", actualResult);
	}

	@Test
	public void sayHi_should_Hello_World() {
		Hello h = new Hello();
		String actualResult = h.sayHi();
		assertEquals("Hello World", actualResult);
	}

}
