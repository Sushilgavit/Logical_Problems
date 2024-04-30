package String;

import java.util.Scanner;

//. Accept string and check if it is palindrome or not e.g (nitin)
public class Q2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left=0;
        int right = str.length()-1;
      while (left<right)
      {
       if (str.charAt(left)!=str.charAt(right))
       {
           System.out.println("not palindrome");
       }
       else
       {
           System.out.println("is palindrome");
       }
       left++;
       right--;
      }

    }
}
