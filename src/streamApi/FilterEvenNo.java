package streamApi;

/*given a list of integer , write a program to filter out the even numbers using streams
and count the number of elements in a list that satisfy a specific condition using streams*/

import java.util.Arrays;
import java.util.List;

public class FilterEvenNo {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(12,13,14,15,16);
        long countOfEven=numbers.stream().filter(num->num%2==0).count();
        System.out.println(countOfEven);
    }
}
