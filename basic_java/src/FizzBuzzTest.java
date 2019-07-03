import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
//	@Test
//	public void input_7_should_say_KBTG() {
//		FizzBuzz fb = new FizzBuzz();
//		String result = fb.say(7);
//		assertEquals("KBTG", result); 
//	}
 
	@Test
	public void input_1_should_say_1() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.say(1);
		assertEquals("1", result); 
	}
	
	@Test
	public void input_2_should_say_2() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.say(2);
		assertEquals("2", result);
	}
	
	@Test
	public void input_3_should_say_Fizz() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.say(3);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void input_6_should_say_Fizz() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.say(6);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void input_5_should_say_Buzz() {
		FizzBuzz fb = new FizzBuzz();
		String result = fb.say(5);
		assertEquals("Buzz", result);
	}
	
//	@Test
//	public void input_15_should_say_FizzBuzz() {
//		FizzBuzz fb = new FizzBuzz();
//		String result = fb.say(15);
//		assertEquals("FizzBuzz", result);
//	}

}
