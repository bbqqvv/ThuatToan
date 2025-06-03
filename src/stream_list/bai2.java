package stream_list;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class bai2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 8, 1, 9);
        Optional<Integer> max = nums.stream()
                                    .min((a, b) -> a - b );
        max.ifPresent(m -> System.out.println(m));

    }
}
