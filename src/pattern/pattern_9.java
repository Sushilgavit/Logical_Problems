package pattern;
/*

3 2 1 2 3
 3 2 3
   3
 */

public class pattern_9 {
    public static void main(String[] args) {
        for (int i=0 ; i<3 ; i++)
        {
            for (int s=0; s<i ;s++ )
            {
                System.out.print(" ");
            }
            for (int k= 3; k>i ; k--)
                System.out.print(k);
            for (int j =i+2; j<=3;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
