package codingNinja;
/*
Data type refers to the type of value a variable has and the way the computer interprets it.
Each data type has a different size. You’ve studied 5 different data types and the sizes of the data types:

Integer: 4 bytes
Long: 8 bytes
Float: 4 bytes
Double: 8 bytes
Character: 1 byte
You’re given a data type. Print its size in bytes.
Example :
Input: Long

Output: 8

Explanation: The size of a Long variable is given as 8 bytes.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
Long


Sample Output 1:
8


Explanation of sample input 1 :
The size of a Long variable is given as 8 bytes.


Sample Input 2:
Float


Sample Output 2:
4*/

import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {
        int  Integer=4 ;
        int Long= 8;
        int Float= 4 ;
        int Double= 8 ;
        int Character= 1 ;

        Scanner sc= new Scanner(System.in);
        String str=sc.next();

        if(str.equals("integer"))
         System.out.println(Integer);
        else if (str.equals("Long"))
            System.out.println(Long);
        else if (str.equals("Float"))
                System.out.println(Float);
        else if (str.equals("Double"))
            System.out.println(Double);
        else if (str.equals("Character"))
            System.out.println(Character);

        else
            System.out.println("not valid");
        }


    }
