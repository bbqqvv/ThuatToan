package stream_int;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bai1 {
		public static void main(String[] args) {
			int[] arr = {1, 2, 3, 4, 5, 2, 3};
			String result = Arrays.stream(arr)
					.boxed()
					.map(x -> String.valueOf(x*x))
					.filter(null)
				    .collect(Collectors.joining(", "));
		}
}
