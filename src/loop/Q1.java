package loop;

import java.util.Scanner;

//Q.1 Accept 10 numbers from user and do sum of it.(do not use array)
public class Q1 {



    public static void main(String[] args) {
      int sum=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0 ; i<10 ; i++)
        {
            System.out.println("enter the no");
            int num = sc.nextInt();
            sum +=num;

        }
        System.out.println("ans :" + sum);
    }
}
