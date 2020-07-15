import java.awt.Point;
import java.util.Arrays;

public class TopZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++) {
				if (i % 2 == 0)
					arr[i][j] = 0;
				else
					arr[i][j] = (int) (Math.random() * 10);
			}

		System.out.println(Arrays.deepToString(arr));

		topZero(arr);

		System.out.println(Arrays.deepToString(arr));

	}

	public static void topZero(int[][] arr) {

		Point notZero = new Point();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] != 0) {
					notZero.x = i;
					notZero.y = j;
					break;
				}
				break;
			}
			break;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					arr[i][j] = arr[notZero.x][notZero.y];
					arr[notZero.x][notZero.y] = 0;
					if (notZero.y < arr[0].length - 1) {
						notZero.y += 1;
					} else if (notZero.y == arr[0].length - 1) {
						notZero.y = 0;
						notZero.x += 1;
					}
				}

			}

		}

	}
}
