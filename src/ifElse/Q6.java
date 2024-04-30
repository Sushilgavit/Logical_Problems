package ifElse;

import java.math.MathContext;
import java.util.Scanner;

/*Find out minimum string sequence
I/P Specification: in the given String, check how many minimum times "one" occurs consecutively .
If There is no "one" in the string then print -1.
O/P Specification: Print the number
    1) Sample I/P
        11000100001111111
    2) Sample I/P
        0001111111
*/
public class Q6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number sequence");
        String str=sc.nextLine();

        int count =0;
        int mcount=Integer.MAX_VALUE;
        if (!str.contains("1"))
        {
            System.out.println("-1");;
        }
        for (int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }else
            {
                mcount=Math.min(mcount ,count);
                count=0;
            }
        }
        mcount  =Math.min(mcount , count);
        System.out.println(mcount);

    }
}
