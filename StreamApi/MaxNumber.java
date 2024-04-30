package StreamApi;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Given a list of integers , write a program to find the maximum element using streams
public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(1,4,2,6,9,5,3) ;

        int maxNum= num.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxNum);
    }
}
