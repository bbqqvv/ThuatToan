package stream_str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bai4 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("An", "Bình", "Cường");
		String result = names.stream()
				.collect(Collectors.joining(", "));

		System.out.println(result); 

	}
}
