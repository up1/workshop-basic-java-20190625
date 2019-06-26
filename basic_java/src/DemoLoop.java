
public class DemoLoop {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// For each
		for (int i : numbers) {
			if(i == 2) {
				continue;
			}
			System.out.println(i);
		}
		
		
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("=====");
//		int i=0;
//		
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<5);
//		System.out.println("=====");
//		
//		i=0;
//		while(i<5) {
//			System.out.println(i);
//			i++;
//		}

	}

}
