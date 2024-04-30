package StreamApi;

import java.util.Arrays;
import java.util.List;

//write a program to remove duplicate elements from a list using streams.
public class DuplicateElements
{

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,5,5,23,2,1,6,7,6,8);
        numbers.stream().distinct().forEach(System.out::println);
    }
}
