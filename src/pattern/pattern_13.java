package pattern;

public class pattern_13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int s = 0; s < i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }
    }
}
