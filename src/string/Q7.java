package string;

import java.util.Scanner;

//7. Accept 5 name from user and print their name in ascending order
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str[] =new String[5];
        for(int i =0 ;i<5 ; i++)
        {
            str[i]=sc.nextLine();
        }

        for(int i=0 ; i<str.length-1 ; i++) {
            for (int j = 0; j < str.length- i - 1 ; j++)
            {
                if (str[j].compareTo(str[j+1])>0)
                {
                    String temp =str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        System.out.println("the words  in ascending orders are");
        for (int i=0 ; i<str.length ; i++)
        {

            System.out.println(str[i]);

        }



    }
}
