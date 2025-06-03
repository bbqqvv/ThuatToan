package stream_int;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bai4 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 2, 3};
		List<Integer> result = Arrays.stream(arr)
			.boxed()
			.distinct()
			.collect(Collectors.toList());
		result.forEach(x -> System.out.print(x + " "));
		
		
		System.out.println("\n");
		//Cách 2
		 System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));

	}
}
