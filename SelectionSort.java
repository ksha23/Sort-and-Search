import java.util.Arrays;

public class SelectionSort {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
				swap(i,smallest,arr);
		}
	}
	
	public static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {8,2,7,4,4,5,8,9,5,6,3,4,8,8,5,4,0,83};
		System.out.println(Arrays.toString(arr));
		System.out.println("------");
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
