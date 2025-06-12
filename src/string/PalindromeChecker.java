package string;

public class PalindromeChecker  {
	 public static boolean isPalindrome(String str) {
	        if (str == null) return false;
	        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        int left = 0, right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
}
