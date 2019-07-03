import static org.junit.Assert.*;

import org.junit.Test;

public class LCDDigitTest {

	@Test
	public void input_2() {
		String expectedResult = ""
				+ " _ \n"
				+ " _|\n"
				+ "|_ \n";
		
		LCDDigit lcd = new LCDDigit();
		assertEquals(expectedResult, lcd.show(2));
	}

}
