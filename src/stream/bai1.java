package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bai1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("An", "Bình", "Cường");
		List<String> result = names.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
