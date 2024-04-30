package StreamApi;


import java.util.Arrays;
import java.util.List;

//Given a list of strings , write a program to Count the no of String Starts With a specif character using streams
public class CountTheNoOfString {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple" , "cherry" , "banana" , "berry" );

        long count=fruits.stream().filter(fruit->fruit.startsWith("a")).count();
        System.out.println(count);
    }
}
