import java.util.HashMap;
import java.util.Map;

public class CountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Java Java Based Program Program";
		System.out.println(countofWords(str));
		System.out.println(countOccurance(str));
	}
	
	public static int countofWords(String word) {
		
		String[] newStr = word.split(" ");		
		int count = 0;
		for(String newS : newStr) {
			count++;
		}
		return count;
	}
	
	public static String countOccurance(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] newStr = str.split(" ");	
		for(String c: newStr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		return map.toString();
	}

}
