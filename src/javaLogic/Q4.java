package javaLogic;

import java.util.Scanner;

public class Q4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of terms in the Fibonacci series: ");
            int terms = scanner.nextInt();

            System.out.println("Fibonacci series up to " + terms + " terms:");
            printFibonacciSeries(terms);

            scanner.close();
        }

        // Method to print Fibonacci series up to n terms
        public static void printFibonacciSeries(int n) {
            int firstTerm = 0, secondTerm = 1;
            System.out.print(firstTerm + " " + secondTerm);

            for (int i = 2; i < n; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(" " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println();
        }
    }


