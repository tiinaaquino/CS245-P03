
public class MergeSort implements SortingAlgorithm {
	
	private int[] array;
	private int[] tempMergeArr;
	
	public void sort(int [] a) {
		this.array = a;
		this.tempMergeArr = new int[a.length];
		mergeSort(0, a.length - 1);
	}
	
	
	public void mergeSort(int bot, int top) {
		if (bot < top) {
			int middle = bot + (top - bot) / 2;
			mergeSort(bot, middle);
			mergeSort(middle + 1, top);
			mergeParts(bot, middle, top);
		}
	}
	
	public void mergeParts(int bot, int middle, int top) {
		for (int i = bot; i <= top; i++) {
			tempMergeArr[i] = array[i];
		}
		
		int i = bot;
		int j = middle + 1;
		int k = bot;
		
		while (i <= middle && j <= top) {
			if (tempMergeArr[i] <= tempMergeArr[j]){
				array[k] = tempMergeArr[j];
				i++;
			}
			else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		
		while (i <= middle) {
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}
	}
	
}
