package loop;

import java.util.Scanner;

// Accept 10 numbers from user and print highest number
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int largeNo=0;
        for (int i = 1 ; i<=10 ;i++) {
            int num = sc.nextInt();
            if(i==1)
                 largeNo=num;
            else if (num>largeNo) {
                largeNo=num;

            }

        }
        System.out.println(largeNo);
    }
}
