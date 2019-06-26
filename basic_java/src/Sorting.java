import java.util.ArrayList;
import java.util.List;

public class Sorting {

	public List<Integer> process(List<Integer> input) {
		List<Integer> result = new ArrayList<>();
		if (input.size() == 1) {
			return input;
		}

		if (input.size() == 2) {
			int first = input.get(0);
			int second = input.get(1);
			if (first > second) {
				result.add(second);
				result.add(first);
			} else {
				result.add(first);
				result.add(second);
			}
		}
		if (input.size() == 3) {

			// Round 1
			int first = input.get(0);
			int second = input.get(1);
			if (first > second) {
				input.remove(0);
				input.remove(0);
				input.add(0, second);
				input.add(1, first);
			}

			first = input.get(1);
			second = input.get(2);
			if (first > second) {
				input.remove(1);
				input.remove(1);
				input.add(1, second);
				input.add(2, first);
			}
			
			// Round 2
			first = input.get(0);
			second = input.get(1);
			if (first > second) {
				input.remove(0);
				input.remove(0);
				input.add(0, second);
				input.add(1, first);
			}

			first = input.get(1);
			second = input.get(2);
			if (first > second) {
				input.remove(1);
				input.remove(1);
				input.add(1, second);
				input.add(2, first);
			}

			return input;
		}
		return result;
	}

}
