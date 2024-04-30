package Array;

import java.util.Scanner;

//. Accept 5 number in an array, accept a number from user and check if given number is there in an array or not
public class Arrya_1 {
    public static void main(String[] args) {
     int [] arr= new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0 ; i<5 ; i++)
        {
            System.out.print("enter number" + (i+1)+":");
            arr[i]=sc.nextInt();
        }

        System.out.print("enter the to search in the array");
        int searchNo=sc.nextInt();

        boolean found=false;
        for (int i = 0; i < arr.length; i++)
        {
            if (i== searchNo)
            {
                found =true;
                break;
            }
        }
        if (found)
        {
            System.out.println("the number" + searchNo + "is present in the array");
        }
        else {
            System.out.println("the number" + searchNo + " is not present in the array");
        }
    }
}
