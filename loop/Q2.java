package loop;

import java.util.Scanner;

//Q.2 Accept a number from user and find a factorial of a number.
public class Q2 {
    static double factorial(int n)
    {
        double result = 1;
        int i = 1;
    while(i <=n)
    {
        result *= i;
        i++;
    }
        return result;
}

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int num=sc.nextInt();

        System.out.println("fact of "+num + " is :" + factorial(num) );
    }
}
