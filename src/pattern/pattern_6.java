package pattern;
/*      1
        2 1
        3 2 1  */
public class pattern_6 {
    public static void main(String[] args) {
        for(int i= 1 ; i<=3 ; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
