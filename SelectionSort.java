public class SelectionSort {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int least = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < least) {
					least = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[least];
			arr[least] = temp;
		}
	}
}
