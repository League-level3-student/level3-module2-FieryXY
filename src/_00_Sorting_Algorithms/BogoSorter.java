package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean completed = false;
		Random random = new Random();
		while(completed == false) {
			for(int j = 0; j < array.length; j++) {
				if(j == 0) {
					continue;
				}
				if(array[j] >= array[j-1]) {
					//cool
					if(j == array.length-1) {
						completed = true;
						return;
					}
				}
				else {
					break;
				}
			}
			int swap1 = random.nextInt(array.length);
			int swap2 = random.nextInt(array.length);
			int holder = array[swap1];
			array[swap1] = array[swap2];
			array[swap2] = holder;
			display.updateDisplay();
		}
	}
}
