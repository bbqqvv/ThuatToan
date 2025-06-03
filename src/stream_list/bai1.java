package stream_list;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class bai1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 8, 1, 9);
        Optional<Integer> max = nums.stream()
                                    .max((a, b) -> a - b);
        max.ifPresent(m -> System.out.println("Số lớn nhất là: " + m));

    }
}
