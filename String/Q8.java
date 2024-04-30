package String;
//. Accept 5 name from user , accept a name from user and check that name is there in array or not

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str[]=new String[5];

        for(int i =0 ;i<5 ; i++)
        {
            System.out.println("enter the name " + (i + 1) +" :" );
            str[i]=sc.nextLine();
        }
        System.out.println("enter the name :");
        String str2=sc.nextLine();

        for (int i =0 ; i<str.length ; i++)
        {
            if(str[i].equals(str2))
            {
                System.out.println("found");
            }
            else
            {
                System.out.println("not found");
            }
        }
    }
}
