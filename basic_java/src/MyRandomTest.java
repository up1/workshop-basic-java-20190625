import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class MyRandomTest {

	@Test
	public void random_0() {
		Random random = new Random() {

			@Override
			public int nextInt(int bound) {
				return 0; 
			}
			
		};
		MyNumber my = new MyNumber(); // Constructor
		my.setRandom(random); // Setter/Property
		assertEquals(0, my.get()); // Method
	}
	
	@Test
	public void random_11_should_return_0() {
		Random random = new Random() {

			@Override
			public int nextInt(int bound) {
				return 11;
			}
			
		};
		MyNumber my = new MyNumber();
		my.setRandom(random); 
		assertEquals(0, my.get());
	}
	
	@Test
	public void random_less_than_0_should_return_0() {
		Random random = new Random() { 

			@Override
			public int nextInt(int bound) {
				return -1;
			}
			
		};
		MyNumber my = new MyNumber();
		my.setRandom(random); 
		assertEquals(0, my.get());
	}

}
