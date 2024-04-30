package String;
//. Accept two string and check both are same or not

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  string 1");
        String str1 = sc.nextLine();
        System.out.println("enter the  string 2");
        String str2 = sc.nextLine();
        if (str2.length() != str1.length()) {
            System.out.println("both strings are diff");
        }
        for (int i =0 ; i<str1.length() ; i++)
        {
            if (str2.charAt(i)!=str1.charAt(i))
            {
                System.out.println("both strings are diff");
            }
        }
        System.out.println("strings are same");
    }

}
