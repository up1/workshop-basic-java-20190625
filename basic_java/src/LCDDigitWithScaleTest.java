import static org.junit.Assert.*;

import org.junit.Test;

public class LCDDigitWithScaleTest {

	@Test
	public void test() {
		String expectedResult = ""
				+ "   \n"
				+ "  |\n"
				+ "  |\n"
				+ "  |\n"
				+ "  |\n";
		
		LCDDigit lcd = new LCDDigit(3,2); 
		assertEquals(expectedResult, lcd.show(1));
	}

}
