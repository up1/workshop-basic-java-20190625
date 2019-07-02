import java.util.Random;

public class MyNumber {
	
	private Random random;
	
	public int get() {
		int number = random.nextInt(10);
		if(number < 0 || number > 10) { 
			return 0;
		}
		return number;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

}
