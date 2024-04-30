package ifElse;

import java.util.Scanner;

// Accept a number from user check if it is odd or even without using (modular)% operator.
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no :");
        int a = sc.nextInt();
        if ((a/2)*2==a)
        {
            System.out.println(a +" is even no");
        }
        else
            System.out.println(a +" is odd no");
    }
}
