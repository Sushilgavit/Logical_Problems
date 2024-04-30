package loop;

import java.util.Scanner;

//Accept 10 numbers from user and print lowest number.
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
    int smallNo=0;
        for (int i = 1 ; i<=10 ;i++) {
        int num = sc.nextInt();
        if(i==1)
            smallNo=num;
        else if (num<smallNo) {
            smallNo=num;

        }

    }
        System.out.println(smallNo);
}
}


