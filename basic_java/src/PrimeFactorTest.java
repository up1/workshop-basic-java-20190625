import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

	@Test
	public void input_2_should_2() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(2);
		assertEquals("2", result); 
	}
	
	@Test
	public void input_4_should_22() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(4);
		assertEquals("22", result);
	}
	
	@Test
	public void input_8_should_222() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(8);
		assertEquals("222", result);
	}
	@Test
	public void input_16_should_2222() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(16);
		assertEquals("2222", result);
	}
	
	@Test
	public void input_3_should_3() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(3);
		assertEquals("3", result);
	}
	
	@Test
	public void input_9_should_33() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(9);
		assertEquals("33", result);
	}
	
	@Test
	public void input_27_should_333() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(27);
		assertEquals("333", result);
	}
	
	@Test
	public void input_6_should_23() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(6);
		assertEquals("23", result);
	}
	
	@Test
	public void input_10_should_25() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(10);
		assertEquals("25", result);
	}
	
	@Test
	public void input_102_should_223() {
		PrimeFactor pf = new PrimeFactor();
		String result = pf.of(12);
		assertEquals("223", result);
	}

}
