import java.util.ArrayList;
import java.util.List;

public class DemoDataStructure {

	public static void main(String[] args) {

		int[] numbers1;
		int numbers2[];
		// Before java 1.5
		List data = new ArrayList();
		data.add("gggg");
		int out = (int) data.get(0);
		
		// After java 1.5
		List<Integer> data2 = new ArrayList<>();
		data2.add(1);
		int out2 = data2.get(0);
		for (Integer integer : data2) {
			
		}

	}

}
