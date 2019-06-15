package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean complete = false;
		int swaps = 0;
		while(complete == false) {
			int lastIndex = 0;
			swaps = 0;
			for(int j = 0; j < array.length; j++) {
				if(array[lastIndex] > array[j]) {
					//Swap code
					int holder = array[lastIndex];
					array[lastIndex] = array[j];
					array[j] = holder;
					swaps++;
				}
				lastIndex = j;
			}
			if(swaps == 0) {
				complete = true;
				break;
			}
			display.updateDisplay();
		}
	}
	
}
