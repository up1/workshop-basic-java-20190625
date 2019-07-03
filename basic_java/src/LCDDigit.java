import java.util.ArrayList;
import java.util.List;

public class LCDDigit {

	private int width = 1;
	private int height = 1;

	public LCDDigit() {
	}

	public LCDDigit(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public String show(int number) {
		String[] firstLine  = { "   ", " _ " };
		String[] secondLine = { "  |", " _|" };
		String[] thirdLine  = { "  |", "|_ " };
		String[] result = { "", "", "" };

		String input = String.valueOf(number);
		int length = input.length();
		// Width
		for (int i = 0; i < length; i++) {
			result[0] += scaling(firstLine[input.charAt(i) - 49]);
			result[1] += scaling(secondLine[input.charAt(i) - 49]);
			result[2] += scaling(thirdLine[input.charAt(i) - 49]);
		}

		// Height
		List<String> newResult = new ArrayList<>();
		for (int line = 0; line < 3; line++) {
			if(result[line].startsWith("|")) {
				for(int i=0;i<height-1; i++) {
					newResult.add(scaleWidth(result[line].length()));
				}
			}
			if(result[line].endsWith("|")) {
				for(int i=0;i<height-1; i++) {
					newResult.add(scaleWidthLast(result[line].length()));
				}
			}
			newResult.add(result[line]);
		}

		String finalResult = "";
		for (String row : newResult) {
			finalResult += row + "\n";
		}

		return finalResult;
	}

	private String scaleWidth(int length) {
		String result = "|";
		for(int i=0; i<length-1; i++) {
			result += " ";
		}
		return result;
	}
	
	private String scaleWidthLast(int length) {
		String result = "";
		for(int i=0; i<length-1; i++) {
			result += " ";
		}
		return result + "|";
	}

	private String scaling(String input) {
		String newInputWithScaled = "";
		for (int i = 0; i < width; i++) {
			newInputWithScaled += "_";
		}
		input = input.replace("_", newInputWithScaled);
		return input;
	}

}
