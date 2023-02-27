//bubble sort
package SearchSort;

public class Task1 {
	public static void main(String[] args) {
		int[] arr = { 10, 11, 91, 1, 0, 4, 1 };
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				flag = 1;
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			if (flag == 0) {
				break;
			}
		}

	}
}
