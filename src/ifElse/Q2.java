package ifElse;

import java.util.Scanner;

//2. Accept three numbers and find out the highest number
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three no");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();

        if (a>b && a>c)
        {
            System.out.println(a+" is highest number (a)");
        }
        else if (b>a && b>c)
        {
            System.out.println(b +" is highest number (b)");
        }
        else
        {
            System.out.println(c +" is highest number (c)");
        }
    }
}
