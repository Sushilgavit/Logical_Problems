package loop;

import java.util.Scanner;

// Accept a number from user and print that many numbers after the number
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int num= sc.nextInt();
        for (int i = 1 ; i<=num ; i++)
            System.out.println(num+i);
    }
}
