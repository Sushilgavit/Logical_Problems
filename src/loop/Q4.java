package loop;

import java.util.Scanner;

// Accept a number from user and count number of digits
public class Q4 {

    public static int count(int num)
    {
        int count=0;
       while(num!=0) {
            num = num / 10;
            ++count;
        }
    return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no");
        int num=sc.nextInt();
        System.out.println("count of digits are :" + count(num));
    }
}
