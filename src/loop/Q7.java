package loop;

import java.util.Scanner;

//Accept a number from user and print next 5 number
public class Q7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int num = sc.nextInt();

        for (int i=1 ;i<=5 ;i++ )
        {
            System.out.println(num+i);
        }
    }
}