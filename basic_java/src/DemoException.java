
public class DemoException {

	public static void main(String[] args) {
		DemoException demo = new DemoException();
		try {
			demo.callException3();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Success");
	}

	private int callException3() {

		String data = "somkiat";
		try {
			return data.charAt(100);
		} catch (StringIndexOutOfBoundsException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	private int callException2() throws Exception {

		String data = "somkiat";
		try {
			return data.charAt(100);
		} catch (StringIndexOutOfBoundsException e) {
			throw new Exception(e.getMessage());
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	private int callException() {

		String data = "somkiat";

		// 1. Logical
		if (data.length() == 100) {
			return data.charAt(100);
		}
		return -1; // Default

	}

}
