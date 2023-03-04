import java.util.Random;
import java.util.Arrays;

public class QuickSort {
	public static void sort(int low, int high, int [] arr) {
		if (low<high) {
			int oldPivot = partition(low, high, arr);
			sort(low, oldPivot-1, arr);
			sort(oldPivot+1, high, arr); 
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
		Random random = new Random();
		return random.nextInt((high-low)+1)+low;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,8,6,5,4,3,2,1,0};
		System.out.println(Arrays.toString(arr));
		System.out.println("------");
		sort(0, arr.length-1, arr);
		System.out.println(Arrays.toString(arr));
	}
}
