package stream_int;

import java.util.Arrays;
import java.util.Comparator;

public class bai5 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 3 };
		Arrays.stream(arr)
			.boxed() 
			.sorted((a,b) -> b - a)
			.forEach(x -> System.out.print(x + " "));
	}
}
