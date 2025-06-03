package stream_list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bai4 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 3, 8, 1, 9);
		List<Integer> result = nums.stream()
									.filter(name -> name % 3 == 0)
									.collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
