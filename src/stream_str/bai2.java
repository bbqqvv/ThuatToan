package stream_str;

import java.util.Arrays;
import java.util.List;

public class bai2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("An", "Bình", "Cường");
		names.stream()
		.distinct()
		.forEach(System.out::println);
	}
}
