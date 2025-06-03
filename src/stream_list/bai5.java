package stream_list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bai5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 8, 1, 9);

        List<String> formatted = nums.stream()
                                     .map(n -> "Số: " + n)
                                     .collect(Collectors.toList());

        formatted.forEach(System.out::println);
    }
}
