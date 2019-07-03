
public class LCDDigit {

	public String show(int number) {
		String[] firstLine  = {"   ", " _ "};
		String[] secondLine = {"  |", " _|"};
		String[] thirdLine  = {"  |", "|_ "}; 
		String[] result = {"", "", ""};
		
		String input = String.valueOf(number);
		int length = input.length();
		
		for (int i = 0; i < length; i++) {
			result[0] +=  firstLine[input.charAt(i)-49];
			result[1] +=  secondLine[input.charAt(i)-49];
			result[2] +=  thirdLine[input.charAt(i)-49];
		}
	
		return  result[0] + "\n" +
				result[1] + "\n" +
				result[2] + "\n";
	}

}
