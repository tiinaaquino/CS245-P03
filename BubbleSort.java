
public class BubbleSort implements SortingAlgorithm{
	
	public void sort(int [] a) {		
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < a.length; i++) {
				if (a[i - 1] > a[i]) {
					swap(a, i-1, i);
					swapped = true;
				}
			}
		}
	}
	
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
