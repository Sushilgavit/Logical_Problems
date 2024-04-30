package streamApi;

import java.util.Arrays;
import java.util.List;

// write a program to find the average of a list of floating point numbers using stream
public class Average {
    public static void main(String[] args) {

        List<Double> numbers= Arrays.asList(1.3,3.6,7.8,3.4,8.9);
      Double avg=numbers.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(avg);
    }
}
