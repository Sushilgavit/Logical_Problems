package number;

import java.util.Scanner;

public class Spyno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int sum=0 , prod= 1;
        while(n!=0)
        {
            int d=n%10;
            sum =sum+d;
            prod=prod*d;
            n=n/10;
        }
        if(sum==prod)
        {
            System.out.println("spy no");
        }
        else
            System.out.println("not spy no");
    }
}
