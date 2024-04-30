package streamApi;

import java.util.Arrays;
import java.util.List;

// write a program to check if all elements in a List satisfy a given condition using streams.
public class AllEvenOrNot {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,6,3,8,4,23,9,2);
        boolean isEven= num.stream().anyMatch(numbers->numbers%2==0);
    }
}
