
public class QuickSort implements SortingAlgorithm {
	
	public void sort(int [] a) {
		quickSort(a, 0, a.length - 1);
	}

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public int partition(int[] a, int top, int bot) {
		int i = top;
		int j = bot;
		int pivot = (top + bot) / 2;
		
		while (i <= j) {
			while (a[i] < a[pivot])
				i++;
			while (a[j] > a[pivot])
				j--;
			if (i <= j) {
				if (i == pivot)
					pivot = j;
				else if (j == pivot)
					pivot = i;
				swap(a, i++, j--);
			}
		}
		return i;
	}
	
	public void quickSort(int[] a, int top, int bot) {
		int pivot = partition(a, top, bot);
		if (top < pivot-1)
			quickSort(a, top, pivot-1);
		if (pivot < bot)
			quickSort(a, pivot, bot);
	}
	
}
