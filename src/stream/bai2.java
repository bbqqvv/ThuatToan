package stream;

import java.util.Arrays;

public class bai2 {
    public static void main(String[] args) {
    	   int[] arr = {1, 2, 3, 4, 5};
           Arrays.stream(arr)
                 .map(n -> n * n) 
                 .forEach(System.out::println); 
    }
}
