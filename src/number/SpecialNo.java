package number;

import java.util.Scanner;

public class SpecialNo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0, prod = 1;
        while (n != 0) {
            int d= n%10;
            sum =d+sum;
            prod=d*prod ;
            n=n/10;
        }
        if (sum+prod ==m   )
            System.out.println("is special no");
        else
            System.out.println("is not special no");
    }
}