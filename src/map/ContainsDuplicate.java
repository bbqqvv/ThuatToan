package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
	public boolean duplicateContains(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
		    if (set.contains(num)) {
		        return true;
		    }
		    set.add(num);
		}
		return false;
	}
}
