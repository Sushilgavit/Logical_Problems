package streamApi;

import java.util.Arrays;
import java.util.List;


// find the sums of all the elements a list using streams

public class SumOfAllElements {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(5,1);
       int sum= nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
