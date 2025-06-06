package map;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
	    if (s.length() != t.length()) return false;
	    Map<Character, Integer> map = new HashMap<>();
	    for (int i = 0; i < s.length(); i++) {
	        char c1 = s.charAt(i);
	        char c2 = t.charAt(i);
	        map.put(c1, map.getOrDefault(c1, 0) + 1);
	        map.put(c2, map.getOrDefault(c2, 0) - 1);
	    }
	    for (int count : map.values()) {
	        if (count != 0) return false;
	    }
	    return true;
	}
}
