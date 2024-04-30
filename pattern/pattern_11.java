package pattern;
/*
 ABCDEBCDECDEDEE
 ABCDEBCDECDEDE
 ABCDEBCDECDE
 ABCDEBCDE
 ABCDE
 */
public class pattern_11 {
    public static void main(String[] args) {
        String str = "ABCDE";
            int length = str.length();
            for(int j=0;j<5;j++)
            {
                for(int i = 0; i<length-j; i++)
                {
                    System.out.print(str.substring(i,length));
                }
                System.out.println();
            }

        }
}
