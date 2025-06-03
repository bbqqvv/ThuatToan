package stream_str;

import java.util.Arrays;
import java.util.List;

public class bai1 {
		public static void main(String[] args) {
			List<String> names = Arrays.asList("An", "Bình", "Cường");
			names.stream()
			.filter(name -> name.length() > 3)
			.forEach(System.out::println);

		}
}
