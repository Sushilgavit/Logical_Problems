package javaLogic;
// 3. Accept a number from user and check if it is palindrome number or not eg (121)

import java.util.Scanner;

public class Q3 {
    static int revno(int n)
    {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }


    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int revN = revno(num);
        System.out.println("Reverse of n = " + revN);


        if (num == revN)
            System.out.println("Palindrome ");
        else
            System.out.println("not Palindrome");
    }
}


