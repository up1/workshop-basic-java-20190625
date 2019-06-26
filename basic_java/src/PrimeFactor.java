
public class PrimeFactor {

	public String of(int number) {
		String result = "";
		int temp = number;

		int primeNumber = 2;
		for (; temp > 1; primeNumber++) {
			for (; temp % primeNumber == 0; temp = temp / primeNumber) {
				result += primeNumber;
			}
		}

//		while(temp%3 == 0) {
//			result += 3;
//			temp = temp / 3;
//		}
//		if(temp%2 == 0) {
//			result += 2;
//			temp = temp / 2;
//		}
//		if(temp%2 == 0) {
//			result += 2;
//			temp = temp / 2;
//		}
//		if(temp%2 == 0) {
//			result += 2;
//			temp = temp / 2;
//		}
		return result;
	}

}
