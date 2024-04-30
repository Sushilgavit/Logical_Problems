package StreamApi;
// Given List of Strings , write a program to concatenate all the strings using streams

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concatenate {
    public static void main(String[] args) {
        List<String> names= Arrays.asList(" sushil" , "sachin" , "tushar" , "ajinkya" );

        String joined = String.join(",", names);
        System.out.println(joined);
    }

}
