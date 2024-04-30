package ifElse;

import java.util.Scanner;

//Q1. Swap 2 variable without using 3rd variable.(three answer)
public class Q1 {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no a=");
        int a=sc.nextInt();
        System.out.println("enter the no b=");
        int b=sc.nextInt();


      if(a!=b)
      {
      a=a+b ;
      b=a-b;
      a=a-b;
      }
    System.out.println("after swaping a="+a+ ", b=" +b);
    }
}
