import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		System.out.println("List as is : "+list);
		
		Integer array[] = list.toArray(new Integer [list.size()]);
		System.out.println(Arrays.toString(array));
		System.out.println(" ");
		
		// To change the list values in the primitive type itself.
		
		int intArray[] = new int[list.size()];
		for(int j = 0; j<array.length; j++) {
			intArray[j] = array[j];
		}
				
				
		for(int i : intArray) {
			System.out.print(i+" ");
		}
		
		
		
		// To change the array to List.
		
		int[] newArray = {3,5,6,8,0,1,34};
		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int n : newArray) {
			li.add(n);
		}
		System.out.println(" ");
		System.out.println(li);
		
	}

}
