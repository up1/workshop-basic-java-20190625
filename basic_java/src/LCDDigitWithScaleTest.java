import static org.junit.Assert.*;

import org.junit.Test;

public class LCDDigitWithScaleTest {

	@Test
	public void test2() {
		String expectedResult = ""
				+ " ___ \n"
				+ "    |\n"
				+ " ___|\n"
				+ "|    \n"
				+ "|___ \n";
		
		LCDDigit lcd = new LCDDigit(3,2); 
		assertEquals(expectedResult, lcd.show(2));
	}
	
	@Test
	public void test2_4() {
		String expectedResult = ""
				+ " ____ \n"
				+ "     |\n"
				+ " ____|\n"
				+ "|     \n"
				+ "|____ \n";
		
		LCDDigit lcd = new LCDDigit(4,2); 
		assertEquals(expectedResult, lcd.show(2));
	}
	
	@Test
	public void test1() {
		String expectedResult = ""
				+ "   \n"
				+ "  |\n"
				+ "  |\n"
				+ "  |\n"
				+ "  |\n";
		
		LCDDigit lcd = new LCDDigit(3,2); 
		assertEquals(expectedResult, lcd.show(1));
	}
	@Test
	public void test1_3() {
		String expectedResult = ""
				+ "   \n"
				+ "  |\n"
				+ "  |\n"
				+ "  |\n"
				+ "  |\n"
				+ "  |\n"
				+ "  |\n";
		
		LCDDigit lcd = new LCDDigit(3,3); 
		assertEquals(expectedResult, lcd.show(1));
	}
	
//	@Test
//	public void test12() {
//		String expectedResult = ""
//				+ "    ___ \n"
//				+ "  |    |\n"
//				+ "  | ___|\n"
//				+ "  ||    \n"
//				+ "  ||___ \n";
//		
//		LCDDigit lcd = new LCDDigit(3,2); 
//		assertEquals(expectedResult, lcd.show(12));
//	}

}
