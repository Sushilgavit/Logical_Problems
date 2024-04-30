package loop;

import java.util.Scanner;

// Accept a number from user and do sum of digit.
public class Q3 {

    public static int sumdigit(int num)
    {
        int sum=0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;

        }
        return sum;
    }

    public static  int sumdigitF(long num)
    {
        long sum =0 ;
        for (long i=num ; i!=0 ; i-- )
        {
            sum =sum +num % 10 ;
            num =num/10;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        long num= sc.nextInt();

        System.out.println("sum of all digit :" + sumdigitF(num));

    }
}
