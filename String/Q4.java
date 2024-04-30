package String;
//. Accept a sentence from user and count number of words

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q4 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int count=0;
        for (int i=0 ; i<str.length(); i++ )
        {
            count++;
        }
        System.out.println(count);
    }

}
