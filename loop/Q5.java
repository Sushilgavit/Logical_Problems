package loop;

//Accept a number from user and reverse it
import java.util.Scanner;

public class Q5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int no=sc.nextInt();
        int rev=0;
        int orgNo=rev;
        while(no!=0)
        {
            rev = rev*10+no%10 ;
            no = no/10 ;
        }



        System.out.println( rev);
    }
}
