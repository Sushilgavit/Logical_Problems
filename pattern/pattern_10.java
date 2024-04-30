package pattern;

/*
Q.2 Write program to print following pictures.
ABCDEFGHIJKLMNOPQRST
ACEGIKMOQS
ADGJMPS
AEIMO
 */

public class pattern_10 {
    public static void main(String[] args) {
        for (char c = 'A' ; c<= 'T' ; c++)
        {
            System.out.print(c);
        }
        System.out.println();
        for (char c='A'; c<='S' ; c+=2)
        {
            System.out.print(c);
        }
        System.out.println();
        for (char c='A' ; c<='S' ; c+=3)
        {
            System.out.print(c);
        }
        System.out.println();
        for (char c='A'; c<='O'; c+=4)
        {
            System.out.print(c);
        }
    }
}
