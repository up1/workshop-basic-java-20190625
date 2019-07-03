import static org.junit.Assert.*;

import org.junit.Test;

public class LCDDigitTest {
	
	@Test
	public void input_1() {
		String expectedResult = ""
				+ "   \n"
				+ "  |\n"
				+ "  |\n";
		
		LCDDigit lcd = new LCDDigit(); 
		assertEquals(expectedResult, lcd.show(1));
	}
	
	@Test
	public void input_12() {
		String expectedResult = ""
				+ "    _ \n"
				+ "  | _|\n"
				+ "  ||_ \n";
		
		LCDDigit lcd = new LCDDigit(); 
		assertEquals(expectedResult, lcd.show(12));
	}

	@Test
	public void input_2() {
		String expectedResult = ""
				+ " _ \n"
				+ " _|\n"
				+ "|_ \n";
		
		LCDDigit lcd = new LCDDigit(); 
		assertEquals(expectedResult, lcd.show(2));
	}
	
	@Test
	public void input_22() {
		String expectedResult = ""
				+ " _  _ \n"
				+ " _| _|\n"
				+ "|_ |_ \n";
		
		LCDDigit lcd = new LCDDigit();
		assertEquals(expectedResult, lcd.show(22));
	}


}
