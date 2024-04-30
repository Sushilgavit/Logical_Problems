package javaLogic;

import java.util.Scanner;

public class Q1_2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int Q = num / 21;
        int R = num % 21;

        if (R == 0) {
            System.out.println("fun-buzz");
        } else if (R <= 3) {
            System.out.println("fun");
        } else {
            System.out.println("buzz");
        }

    }
}
