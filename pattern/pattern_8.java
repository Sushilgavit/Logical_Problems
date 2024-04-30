package pattern;

/*
   1
 1 2 1
1 2 3 2 1
 1 2 1
   1


 */
public class pattern_8 {
    public static void main(String[] args) {
        for(int i=1 ;  i<=3 ; i++)
        {
            for(int s=3 ;s>i; s-- )
                System.out.print(" ");
            for (int j=1 ; j<=i ; j++)
                System.out.print(j);
            for (int k =i-1 ; k>=1 ; k--)
                System.out.print(k);
            System.out.println();

        }
        for (int i=2 ; i>=1 ; i--)
        {
            for(int s=i-1 ; s<2 ; s++)
                System.out.print(" ");
            for (int J=1 ;J<=i;J++)
                System.out.print(J);
            for (int J=i-1; J>=1 ; J--)
                System.out.print(J);
            System.out.println();

        }

    }
}
