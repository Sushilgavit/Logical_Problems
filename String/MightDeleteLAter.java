package String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MightDeleteLAter  {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(4 ,2 ,7 ,13, 14, 48, 32, 8, 10);
        int count = number.stream()
                .filter(num -> num % 2 == 0) // intermediate operation: filter numbers divisible by 2
                .sorted() // intermediate operation: sort the filtered numbers
                .mapToInt(Integer::intValue) // intermediate operation: convert Integer to int
                .sum(); // terminal operation: sum up the sorted numbers




        System.out.println("Total sum of numbers divisible by 2: " + count);

    }
}
