
public class FizzRule implements MyRule {

	public boolean check(int number) {
		return number%3 == 0;
	}

	public String say() {
		return "Fizz";
	}

}
