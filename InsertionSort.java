import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] unSorted = {2, 4, 1, 2, 3, 5, 7, 3, 6, 1};
		insertionSort(unSorted);
		System.out.println(Arrays.toString(unSorted));
		
	}
	
	public static void insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			
			int value = arr[i];
			int j = i;
			
			while(j - 1 >= 0 && arr[j-1] > value) {
				
				arr[j] = arr[j-1];
				j--;
				
			}
			
			arr[j] = value;
			
		}
		
	}

}
