package javaLogic;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// Accept a number from user - if it is divisible by 3 print “fun” , if it is divisible by 7 print “buzz”
//and if it is divisible by both(3,7) print “fun -buzz” . [Two answer]
public class Q1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            if (num % 7 == 0) {
                {
                    System.out.println("fun-buzz");
                }
            }
            else
                System.out.println("fun");
        }
        else if(num%7==0)
            System.out.println("buzz");
    }
}



