package ifElse;

import java.util.Scanner;

//Accept a number from user, if it is divisible by 3 print “three”, if it is divisible by 7 print “seven” and if it is
//divisible by both (3 &7) print “three-seven”.
public class Q3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no :");
        int a=sc.nextInt();

         if (a%3==0 && a%7==0)
        {

            System.out.println(a + " is divisible by the 3 and 7 both");

        }

       else if (a%3==0)
        {
            System.out.println(a + " is divisible by the 3");
        }
        else if (a%7==0)
        {
            System.out.println(a + " is divisible by the 7");
        }
    }
}
