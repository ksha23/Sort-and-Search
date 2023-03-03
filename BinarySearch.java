public class BinarySearch{

	public static int search(int[] arr, int findMe) {
		int left = 0;
		int right = arr.length-1;
		int middle;
		while (left<=right) {
			middle = (left+right)/2;
			if (findMe>arr[middle]) {
				left = middle+1;
			}
			else if (findMe<arr[middle]) {
				right = middle-1;
			}
			else {
				return middle;
			}
		}
		return -1;
	}
}
