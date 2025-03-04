import java.util.Arrays;

public class ShiftOddAndEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// To store the even numbers at the left of array and odd numbers at the right
		// of array.

		// Solution 1 - Brute force.
		bruteforce(array);

		// Solution 2 - Optimized way 1.
		System.out.println();
		optimizeOne(array);

		// solution 3 - Optimized way 2.
		System.out.println();
		optimizedTwo(array);

	}

	public static void bruteforce(int[] arr) {
		int result[] = new int[arr.length];
		int index = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				result[index++] = i;
			}
		}

		for (int j : arr) {
			if (j % 2 != 0) {
				result[index++] = j;
			}
		}

		for (int res : result) {
			System.out.print(res);
		}
	}

	public static void optimizeOne(int[] arr) {

		int left = 0;
		int right = 0;

		while (right < arr.length) {
			if (arr[right] % 2 == 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
			}
			right++;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void optimizedTwo(int[] arr) {

		int left = 0;
		int right = arr.length;

		while (right < left) {
			if (arr[left] % 2 == 0) {
				left++;
			}else if(arr[right] % 2 ==0) {
				right--;
			}else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
