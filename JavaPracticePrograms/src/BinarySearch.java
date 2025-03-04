
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = 20;
		int[] arr = { 1, 3, 2, 5, 7, 11, 20, 45, 67 };
		System.out.println("Solution is ");

		binarySearch(target, arr);

	}

	public static void binarySearch(int target, int[] arr) {

		int n = arr.length;
		int left = 0;
		int right = n;
		while (right > left) {
			int mid = (left + (left + right)) / 2;
			
			if (target == arr[mid]) {
				System.out.println("Value is present and the target is :" + arr[mid]);
				break;
			} 
			
			if (target > arr[mid]) {
				left++;
			}else if(target < arr[mid]) {
				right--;
			}
		}
	}

}
