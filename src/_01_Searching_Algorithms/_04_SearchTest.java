package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] wordTest = {"dog", "cat", "Superman", "Nanoman", "You want to find me", "Are you sure?", "halle lua", "thank you"};
		assertEquals(2, _00_LinearSearch.linearSearch(wordTest, "Superman"));
		
		String[] wordTest2 = {"Iron Man", "Doggy Steph", "Sunglasses and Cheese"};
		assertEquals(0, _00_LinearSearch.linearSearch(wordTest2, "Iron Man"));
		
		Random random = new Random();
		int arrLength = random.nextInt(30)+10;
		int toIndex = random.nextInt(arrLength-1);
		String[] wordTest3 = new String[arrLength];
		for(int j = 0; j < arrLength; j++) {
			wordTest3[j] = String.valueOf(random.nextInt(70));
		}
		String toValue = wordTest3[toIndex];
		assertEquals(toIndex, _00_LinearSearch.linearSearch(wordTest3, toValue));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		
		//I made three randomly generated arrays which are sorted
		Random rand = new Random();
		for(int i = 0; i < 3; i++) {
			int arrLength = rand.nextInt(30)+10;
			int toIndex = rand.nextInt(arrLength-1);
			int lastValue = 0;
			int[] arr = new int[arrLength];
			for(int j = 0; j < arrLength; j++) {
				arr[j] = lastValue+rand.nextInt(50);
				lastValue = arr[j];
			}
			int toValue = arr[toIndex];
			assertEquals(toIndex, _01_BinarySearch.binarySearch(arr, 0, arr.length-1, toValue));
		}
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		
		//I made three randomly generated sorted arrays which are evenly distributed
		Random rand = new Random();
		for(int i = 0; i < 3; i++) {
			int arrLength = rand.nextInt(30)+10;
			int toIndex = rand.nextInt(arrLength-1);
			int lastValue = 0;
			int slope = rand.nextInt(70);
			int[] arr = new int[arrLength];
			for(int j = 0; j < arrLength; j++) {
				arr[j] = lastValue+slope;
				lastValue = arr[j];
			}
			int toValue = arr[toIndex];
			assertEquals(toIndex, _02_InterpolationSearch.interpolationSearch(arr, toValue));
		}
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		
		Random rand = new Random();
		for(int i = 0; i < 3; i++) {
			int arrLength = rand.nextInt(50)+10;
			int toIndex = rand.nextInt(arrLength-1);
			int lastValue = 0;
			int[] arr = new int[arrLength];
			for(int j = 0; j < arrLength; j++) {
				arr[j] = lastValue+rand.nextInt(50);
				lastValue = arr[j];
			}
			int toValue = arr[toIndex];
			assertEquals(toIndex, _03_ExponentialSearch.exponentialSearch(arr, toValue));
		}
	}
}
