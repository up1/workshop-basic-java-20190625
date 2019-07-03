
public class LCDDigit {
	
	private int width = 1;
	private int height = 1;

	public LCDDigit() {}
	
	public LCDDigit(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public String show(int number) {
		String[] firstLine  = {"   ", " _ "};
		String[] secondLine = {"  |", " _|"};
		String[] thirdLine  = {"  |", "|_ "}; 
		String[] result = {"", "", ""};
		
		String input = String.valueOf(number);
		int length = input.length();
		
		for (int i = 0; i < length; i++) {
			result[0] +=  scaling(firstLine[input.charAt(i)-49]);
			result[1] +=  scaling(secondLine[input.charAt(i)-49]);
			result[2] +=  scaling(thirdLine[input.charAt(i)-49]);
		}
	
		return  result[0] + "\n" +
				result[1] + "\n" +
				result[2] + "\n";
	}

	private String scaling(String input) {
		String newInputWithScaled = "";
		for(int i=0; i<width; i++) {
			newInputWithScaled += "_";
		}
		input = input.replace("_", newInputWithScaled );
		return input;
	}

}
