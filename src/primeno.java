import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int p = sc.nextInt();

        boolean isPrime = true;

            for (int i = 2; i <= p / 2; i++) {
                if (p % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(p + "prime");
            } else {
                System.out.println(p + "not prime");
            }
        }

}
