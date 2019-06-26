
public class FizzBuzz {

	public String say(int number) {
		String result = "";
		
		if (หารสามลงตัว(number)) {
			result = "Fizz"; 
		}
		if (number % 5 == 0) {
			result = result + "Buzz";
		}
		
		if(number == 100) {
			result = "100000";
		}
		
		if("".equals(result)) {
			result = String.valueOf(number);
		}

		return result;
	}

	private boolean หารสามลงตัว(int number) {
		return number % 3 == 0;
	}

}
