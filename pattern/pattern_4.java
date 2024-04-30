package pattern;
/*      1
        2 3
        4 5 6
*/

public class pattern_4 {
    public static void main(String[] args) {
        int n=1;
        for (int i = 1 ; i<=3 ;i++) {
            for(int j = 1 ; j<=i ; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println( );
        }

    }
}
