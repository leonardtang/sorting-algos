import java.util.Arrays;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,5,8,10,12,15,20};
		
	/*	System.out.println(binSearch(arr, 12));
		System.out.println(binSearch(arr, 1));
		System.out.println(binSearch(arr, 20));
		System.out.println(binSearch(arr, 13));*/
		
		int[] unSorted = {2, 4, 2, 6, 3, 1, 5};
		bubbleSort(unSorted);
		System.out.println(Arrays.toString(unSorted));
		
		int[] unSortedA = {2, 4, 2, 6, 3, 1, 5};
		selectionSort(unSortedA);
		System.out.println(Arrays.toString(unSortedA));
		
		
		int[] unSortedB = {2, 4, 2, 6, 3, 1, 5};
		insertionSort(unSortedB);
		System.out.println(Arrays.toString(unSortedB));
	}
	
	public static int linSearch(int[] arr, int element) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) 
				return i;
		}
		
		return -1;
				
	}
	
	public static int binSearch(Object[] arr, Object element) {
				
		// precondition - arr is sorted
		int start = 0;
		int end = arr.length - 1;	
		int middleIndex;
						
		while(start <= end) {
			middleIndex = (end + start)/2; 
			if(((Comparable) element).compareTo(arr[middleIndex]) > 0)
				start = middleIndex + 1;					
			else if (((Comparable) element).compareTo(arr[middleIndex]) < 0)
				end = middleIndex - 1;
			else if (arr[middleIndex].equals(element))
				return middleIndex;
			
		}
		
		return -1; 
		
		
	}
	
	public static void bubbleSort(int[] arr) {
		
		boolean swaps = false;
		do {
			
			swaps = false;
			for(int i = 0; i < arr.length - 1; i++) {
				
				if(arr[i] > arr[i + 1]) {
					swaps = true;
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
				}
			}
			
						
		} while(swaps);
		
		
	}
	
	public static void selectionSort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int smallest = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < arr[smallest])
					smallest = j;				
			}
			
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			
		}
		
	}
	
	public static void insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int j = i;			
			int value = arr[i];
			while(j > 0 && arr[j - 1] > value) {
				arr[j] = arr[j-1];
				j--;				
			}
			
			arr[j] = value;
			
		}
		
		
	}
	
	
	

}
