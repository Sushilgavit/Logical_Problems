package Number;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
       int m= n;
       int sum=0;
       while(n!=0)
       {
           int d=n%10;
           sum=sum*10+d;
           n=n/10;
       }
       if (sum==m)
       {
           System.out.println("palindrome");
       }
       else
           System.out.println("not palindrome");

    }
}
