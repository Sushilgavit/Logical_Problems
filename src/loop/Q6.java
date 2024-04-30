package loop;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int num=sc.nextInt();
        int OrgNo=num;
        int rev=0;

        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }

        if (OrgNo== rev)

            System.out.println(OrgNo + " is pallindrome");

        else
            System.out.println(OrgNo  +" is not pallindrome");

    }

}
