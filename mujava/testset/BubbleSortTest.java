import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortTest {
	@Test
	public void test() {
		int arr[] = new int[] { 1, 6, 2, 2, 5 };
		int expected[] = new int[] { 1, 2, 2, 5, 6 };
		arr = BubbleSort.BubbleSort(arr);
		assertEquals(Arrays.toString(expected), Arrays.toString(arr));
	}
}
