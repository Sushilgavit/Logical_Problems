package javaLogic;

import java.util.Scanner;

public class Leapyear
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if(year%4==0)
        {
            if (year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println(year + " year is leap year");
                }
                else
                {
                    System.out.println( year + " year is not leap year");
                }
            }
            else
            {
                System.out.println(year + " year is not leap year");
            }
        }
        else
        {
            System.out.println(year +" year is not leap year");
        }

    }
}
