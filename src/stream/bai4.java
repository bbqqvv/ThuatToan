package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class bai4 {
    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 8, 2};
        List<Integer> sortedList = Arrays.stream(nums)
                                         .boxed()         
                                         .sorted()      
                                         .collect(Collectors.toList()); 
        System.out.println(sortedList);
    }
}
