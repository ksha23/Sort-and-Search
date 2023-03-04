import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] arr) {
		for (int i = 0; i<arr.length-1; i++) {
			for (int j = 0; j<arr.length-1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j,j+1, arr);
					System.out.println(Arrays.toString(arr));

				}
			}
			
		}
	}
	
	public static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {8,7,6,5,4};
		System.out.println(Arrays.toString(arr));
		System.out.println("------");
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
