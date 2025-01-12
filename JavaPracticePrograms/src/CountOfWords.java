import java.util.HashMap;
import java.util.Map;

public class CountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Java Java Based Program Program";
		String Original = "Programmingggg Javaaa";
		System.out.println(countofWords(str));
		System.out.println(countOccurance(str));
		duplicateCharacters(Original);
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
	
	public static void duplicateCharacters(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for( char findSeq : str.toCharArray()) {
			if(map.containsKey(findSeq)) {
				map.put(findSeq, map.get(findSeq)+1);
			}else {
				map.put(findSeq, 1);
			}
		}
		
		for(Character value : map.keySet()) {
			if(map.get(value)>1) {
				System.out.println(value + " " +map.get(value));
			}
		}
	}

}
