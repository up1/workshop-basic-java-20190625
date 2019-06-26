import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SortingTest {

	@Test
	public void input_1_after_sort_should_1() {
		Sorting s = new Sorting();
		List<Integer> result = s.process(list(1));
		assertEquals(list(1), result);
	}
	
	@Test
	public void input_12_after_sort_should_12() {
		Sorting s = new Sorting();
		List<Integer> result = s.process(list(1,2));
		assertEquals(list(1,2), result);
	}
	
	@Test
	public void input_21_after_sort_should_12() {
		Sorting s = new Sorting();
		List<Integer> result = s.process(list(2,1));
		assertEquals(list(1,2), result);
	}
	
	@Test
	public void input_123_after_sort_should_123() {
		Sorting s = new Sorting();
		List<Integer> result = s.process(list(1,2,3));
		assertEquals(list(1,2,3), result);
	}
	
	@Test
	public void input_213_after_sort_should_123() {
		Sorting s = new Sorting();
		List<Integer> result = s.process(list(2,1,3));
		assertEquals(list(1,2,3), result);
	}
	
	@Test
	public void input_132_after_sort_should_123() {
		Sorting s = new Sorting();
		List<Integer> result = s.process(list(1,3,2));
		assertEquals(list(1,2,3), result);
	}
	
	@Test
	public void input_321_after_sort_should_123() {
		Sorting s = new Sorting();
		List<Integer> result = s.process(list(3,2,1));
		assertEquals(list(1,2,3), result);
	}
	
//	@Test
//	public void input_4321_after_sort_should_1234() {
//		Sorting s = new Sorting();
//		List<Integer> result = s.process(list(4,3,2,1));
//		assertEquals(list(1,2,3,4), result);
//	}
	
	private List<Integer> list(int ... numbers){
		List<Integer> myList = new ArrayList<>();
		for (int n : numbers) {
			myList.add(n);
		}
		return myList;
	}

}
