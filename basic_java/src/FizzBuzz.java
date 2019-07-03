
public class FizzBuzz {

	public String say(int number) {
		String result = ""; 
		
		// Relationship
		MyRule[] rules = {new FizzRule(), new BuzzRule()};
		
		for (MyRule myRule : rules) {
			if (myRule.check(number)) {
				return myRule.say(); 
			}
		}
		
//		MyRule fizzRule = new FizzRule();
//		if (fizzRule.check(number)) {
//			result = fizzRule.say(); 
//		}
//		MyRule buzzRule = new BuzzRule();
//		if (buzzRule.check(number)) {
//			result = result + buzzRule.say();
//		}
		
		if("".equals(result)) {
			result = String.valueOf(number);
		}

		return result;
	}

}
