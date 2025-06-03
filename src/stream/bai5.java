package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bai5 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("An", "Bình", "Cường", "Dũng", "An");
		List<String> result = names.stream().distinct() 
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
