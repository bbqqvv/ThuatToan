package stream_list;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class bai3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 8, 1, 9);
        
        OptionalDouble av = nums.stream()
                                .mapToInt(Integer::intValue)
                                .average();

        av.ifPresent(avg -> System.out.println("Trung bình cộng là: " + avg));
    }
}
