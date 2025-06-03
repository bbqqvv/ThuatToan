package stream_int;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bai3 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 2, 3};

		List<Integer> result = Arrays.stream(arr)
			.filter(x -> x % 2 == 0)
			.boxed() 
			.collect(Collectors.toList());

		System.out.println(result); 
	}
}
