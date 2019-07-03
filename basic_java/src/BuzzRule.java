
public class BuzzRule implements MyRule {

	public boolean check(int number) {
		return number%5 == 0;
	}

	public String say() {
		return "Buzz";
	}

}
