import java.util.ArrayList;
import java.util.List;

public class Sorting {

	public List<Integer> process(List<Integer> input) {
		if (input.size() > 1) {
			for (int i = 0; i < input.size() - 1; i++) {
				for (int j = 0; j < input.size() - 1; j++) {
					swap(input, j);
				}
			}
		}
		return input;
	}

	private void swap(List<Integer> input, int startPosition) {
		int first = input.get(startPosition);
		int second = input.get(startPosition + 1);
		if (first > second) {
			input.remove(startPosition);
			input.remove(startPosition);
			input.add(startPosition, second);
			input.add(startPosition + 1, first);
		}
	}

}
