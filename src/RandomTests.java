import java.awt.Point;
import java.util.Arrays;

public class RandomTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[5][6];
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
				arr[i][j] = (int)(Math.random()*100);
		
		System.out.println(Arrays.deepToString(arr));
		sortByColumn(arr, 3);
		System.out.println(Arrays.deepToString(arr));
		sort2D(arr);
		System.out.println(Arrays.deepToString(arr));
		
		int[][] arrSorted = new int[5][6];
		int a = 1;
		for(int i = 0; i < arrSorted.length; i++)
			for(int j = 0; j < arrSorted[i].length; j++) {
				arrSorted[i][j] = a;
				a++;
			}
		System.out.println(Arrays.deepToString(arrSorted));
		System.out.println(binarySearch2D(arrSorted, 29));
	}

	public static void sortByColumn(int[][] arr2D, int column) {

		for (int i = 0; i < arr2D.length; i++) {
			int minRow = i;
			for (int j = i + 1; j < arr2D.length; j++) {
				if (arr2D[j][column] < arr2D[minRow][column]) {
					minRow = j;
				}
			}
			int[] temp = arr2D[i];
			arr2D[i] = arr2D[minRow];
			arr2D[minRow] = temp;
		}

	}
	
	public static void sort2D(int[][] arr2D) {
		
		for(int i = 0; i < arr2D.length; i++) {
			for(int j = 0; j < arr2D[i].length; j++) {
				Point min = searchMin2D(arr2D, new Point(i, j));
				int temp = arr2D[i][j];
				arr2D[i][j] = arr2D[min.x][min.y];
				arr2D[min.x][min.y] = temp;
			}
		}
		
	}

	public static Point searchMin2D(int[][] arr2D, Point start) {
		
		Point min = start;
		for(int i = start.x; i < arr2D.length; i++) {
			
			int yStart;
			if(i == start.x)
				yStart = start.y;
			else
				yStart = 0;
			
			for(int j = yStart; j < arr2D[i].length; j++) {
				if(arr2D[i][j] < arr2D[min.x][min.y])
					min = new Point(i, j);
			}
		}
		
		return min;
		
	}
	
	public static Point binarySearch2D(int[][] arr2D, int element) {
		
		int start = 0;
		int end = arr2D.length - 1;
		while(start <= end) {
			int midSpot = (end + start)/2;
			if(arr2D[midSpot][0] == element)
				return new Point(midSpot, 0);
			else if(arr2D[midSpot][0] < element)
				start = midSpot + 1;
			else if(arr2D[midSpot][0] > element)
				end = midSpot - 1;			
		}
	
		if(start != 0) {
			for(int i = start - 1; i < start + 1; i++)
				for(int j = 0; j < arr2D[i].length; j++)
					if(arr2D[i][j] == element)
						return new Point(i, j);
			
		}
		else
			for(int i = start; i < start + 1; i++)
				for(int j = 0; j < arr2D[i].length; j++)
					if(arr2D[i][j] == element)
						return new Point(i, j);
		return null;
				
	}
	
	
}
