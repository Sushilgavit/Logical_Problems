package javaLogic;

import java.util.Scanner;

//Accept a start number from user and end number from user. Print all odd number between
//start and end number. [ Two Answer
public class Q2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start  number: ");
        int startNum = scanner.nextInt();
        System.out.print("Enter the End number :");
        int endNum = scanner.nextInt();

        for (int i=startNum; endNum>=i ; i++)
        {
            if (i%2!=0)
            {
                System.out.println("odd no is :"+ i);
            }



        }
    }
}
