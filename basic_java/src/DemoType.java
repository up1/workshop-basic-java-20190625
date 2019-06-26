
public class DemoType {

	public static void main(String[] args) {
		int[] datas = { 1, 2, 3, 4, 5 };
		int len = datas.length;
		for (int i = 0; i < len; i++) {
			System.out.println(datas[i]);
		}
		
		for (int i : datas) {
			
		}
		
		System.out.println(
				"somkiat".substring(1, 1));
		System.out.println(
				"somkiat".charAt(1));
	}

	void demoString() {
		String s1 = new String("somkiat");
//		String s1 = "somkiat";

		if ("somkiat".equals(s1)) {
			System.out.println("OK");
		} else {
			System.out.println("Not OK");
		}
	}

	void demoInteger() {
		Integer i = 127;
		Integer j = 127;

		if (i.equals(j)) {
			System.out.println("OK");
		} else {
			System.out.println("Not OK");
		}
	}

}
