package sortiing;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] dynamicArray = new int[size];
        for (int i =0 ; i<size ; i++)
        {
            dynamicArray[i] = sc.nextInt();
        }
        System.out.print("array before sorting : ");
        for (int i = 0 ; i< size ; i++) {
            System.out.print(dynamicArray[i] + ",");
        }

        System.out.println(" ");

        for(int i = 0 ; i<size ; i++)
        {
            for(int j=0 ; j<size-i-1;j++)
            {
                if (dynamicArray[j]>dynamicArray[j+1])
                {
                    int temp = dynamicArray[j];
                    dynamicArray[j]=dynamicArray[j+1];
                    dynamicArray[j+1]=temp;
                }
            }
        }
        System.out.print( "Array after sorting :");
        for (int i = 0 ; i<size ; i++)
        {
            System.out.print(dynamicArray[i] +",");
        }


    }
}
