import java.util.Random;

public class QuickSort {
	public static void sort(int low, int high, int [] arr) {
		if (low<high+1) {
			int p = partition(low, high, arr);
			sort(low, p-1, arr);
			sort(p+1, high, arr); 
		}
	}
	
	private static int partition(int low, int high, int[]arr) {
		swap(low, getPivot(low, high), arr);
		int pointer = low+1;
		for (int i = pointer; i<=high; i++) {
			if (arr[i]<arr[low]) {
				swap(i,pointer++, arr);
			}
		}
		swap(low, pointer-1, arr);
		return pointer-1;
	}
	
	private static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	private static int getPivot(int low, int high) {
		Random r = new Random();
		return r.nextInt((high-low)+1)+low;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,8,8,9,6,7,5,6,2};
		for (int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------");
		sort(0, arr.length-1, arr);
		for (int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int j = 9;
		System.out.println(j++);
	}
}
