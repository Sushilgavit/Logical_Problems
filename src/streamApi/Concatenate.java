package streamApi;
// Given List of Strings , write a program to concatenate all the strings using streams

import java.util.Arrays;
import java.util.List;

public class Concatenate {
    public static void main(String[] args) {
        List<String> names= Arrays.asList(" sushil" , "sachin" , "tushar" , "ajinkya" );

        String joined = String.join(",", names);
        System.out.println(joined);
    }

}
