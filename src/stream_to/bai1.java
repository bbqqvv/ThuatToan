package stream_to;

import java.util.Arrays;
import java.util.List;

public class bai1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("An", "Bình", "Trung", "Lan");

		String result = names.stream()
		    .filter(name -> name.length() > 3)
		    .map(String::toLowerCase)
		    .reduce("", (a, b) -> a + b); 

		System.out.println("Kết quả ghép tên: " + result);

	}
}
