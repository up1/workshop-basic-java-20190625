
public class KBTGRule implements MyRule {

	public boolean check(int number) {
		return number%7 ==0;
	}

	public String say() {
		return "KBTG";
	}

}
