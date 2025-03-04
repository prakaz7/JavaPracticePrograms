import java.util.HashMap;
import java.util.Map;

public class AnagramsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "listen";
		String s2 = "silent";

		// Check whether the given two strings are anagram or not.

		// Solution 1:
		if (isAnagram(s1, s2)) {
			System.out.println("The given strings are Anagram");
		} else {
			System.out.println("The given strings are not an Anagram");
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Approach 2 ");
		// solution 2:
		if (isAnargramCheck(s1, s2)) {
			System.out.println("The given strings are Anagram");
		} else {
			System.out.println("The given strings are not an Anagram");
		}

	}

	public static boolean isAnagram(String s1, String s2) {

		s1 = s1.replaceAll("\\s", s1.toLowerCase());
		s2 = s2.replaceAll("\\s", s2.toLowerCase());

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		if (s1.length() != s2.length()) {
			return false;
		}

		for (char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char x : s2.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) - 1);
		}
		for (int i : map.values()) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAnargramCheck(String s1, String s2) {

		int count[] = new int[26];
		for (char c : s1.toCharArray()) {
			count[c - 'a']++;
		}
		for (char c : s2.toCharArray()) {
			count[c - 'a']--;
		}
		for (int i : count) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

}
