import static org.junit.Assert.*;

import org.junit.Test;

public class MyRangeTest {

	@Test
	public void 
	start_with_include() {
		MyRange r = new MyRange("[1,5]");
		boolean result = r.startWithInclude();
		assertTrue(result);
	}
	
	@Test
	public void 
	start_with_exclude() {
		MyRange r = new MyRange("(1,5]");
		boolean result = r.startWithInclude();
		assertFalse(result);
	}
	
	@Test
	public void 
	start_with_include_1_should_1() {
		MyRange r = new MyRange("[1,5]");
		int result = r.getStart();
		assertEquals(1, result);
	}
	
	@Test
	public void 
	start_with_exclude_1_should_2() {
		MyRange r = new MyRange("(1,5]");
		int result = r.getStart();
		assertEquals(2, result);
	}
	
	@Test
	public void 
	end_with_include() {
		MyRange r = new MyRange("[1,5]");
		boolean result = r.endWithInclude();
		assertTrue(result);
	}
	
	@Test
	public void 
	end_with_exnclude() {
		MyRange r = new MyRange("[1,5)");
		boolean result = r.endWithInclude();
		assertFalse(result);
	}
	
	@Test
	public void 
	end_with_include_5_should_5() {
		MyRange r = new MyRange("[1,5]");
		int result = r.getEnd();
		assertEquals(5, result);
	}
	
	@Test
	public void 
	end_with_exclude_5_should_4() {
		MyRange r = new MyRange("[1,5)");
		int result = r.getEnd();
		assertEquals(4, result);
	}
	
	@Test
	public void 
	first_case() {
		MyRange r = new MyRange("[1,5]");
		String result = r.format();
		assertEquals("12345", result);
	}

}
