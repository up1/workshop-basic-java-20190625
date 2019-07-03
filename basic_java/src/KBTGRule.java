
public class KBTGRule implements MyRule {

	@Override
	public boolean check(int number) {
		return number%7 ==0;
	}

	@Override
	public String say() {
		return "KBTG";
	}

}
