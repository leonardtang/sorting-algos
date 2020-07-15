import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] unSorted = {2, 4, 1, 2, 3, 5, 7, 3, 6, 1};
		insertionSort(unSorted);
		System.out.println(Arrays.toString(unSorted));
		
	}
	
	public static void insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int spot = i - 1;
			
			while(arr[spot] > value && spot >= 0) {
				
				arr[spot + 1] = arr[spot];
				spot = spot - 1;
			}
			arr[spot + 1] = value; 
			
		}
		
		
	}
	
	public static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 

}
