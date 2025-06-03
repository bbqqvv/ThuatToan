package stream_str;

import java.util.Arrays;
import java.util.List;

public class bai3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("An", "Bình", "Cường");
        long count = names.stream()
                          .filter(name -> name.startsWith("A"))
                          .count();
        System.out.println("Số lượng tên bắt đầu bằng chữ 'A': " + count);
    }
}
