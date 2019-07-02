
public class MyRange {

	private static final int ASCII_CODE_ZERO = 48;
	private String input;

	public MyRange(String input) {
		this.input = input;
	}

	public boolean startWithInclude() {
		return input.startsWith("[");
	}

	public int getStart() {
		if(startWithInclude()) {
			return input.charAt(1) - ASCII_CODE_ZERO;
		} 
		return input.charAt(1) - 47;
	}

	public boolean endWithInclude() {
		return input.endsWith("]");
	}

	public int getEnd() {
		if(endWithInclude()) {
			return input.charAt(3) - ASCII_CODE_ZERO;
		}
		return input.charAt(3) - 49;
	}

	public String format() {
		int start = getStart();
		int end = getEnd();
		String result = "";
		for(int i=start; i<= end; i++) {
			result += i;
		}
		return result;
	}

}
