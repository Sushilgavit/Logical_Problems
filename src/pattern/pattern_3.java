package pattern;

     /*      1
            2 2
           3 3 3 */
public class pattern_3 {
         public static void main(String[] args) {
             for (int i = 1; i <= 3; i++)
             {
                 for (int s = 3; s >= i; s--)
                          System.out.print(" ");
                     for (int j = 1; j <= i; j++)
                         System.out.print(" "+i);
                         System.out.println(" ");


             }
         }
     }
