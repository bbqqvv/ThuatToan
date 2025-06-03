package stream_int;

import java.util.Arrays;

public class bai2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 3 };
		System.out.println(Arrays.stream(arr).sum());
	}

}
