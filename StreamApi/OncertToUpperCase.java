package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// convert a list of string to uppercase
public class OncertToUpperCase {

    public static void main(String[] args) {

        List<String> list= Arrays.asList(" sushil" , "sachin" , "tushar" , "ajinkya" );
           List<String> UppercaseList =list.stream().map(String::toUpperCase).toList();
        System.out.println(UppercaseList);
    }
}
