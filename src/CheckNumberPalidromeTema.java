import java.util.Scanner;

public class CheckNumberPalidromeTema {
    /** Java program to check whether
     * a number is Palindrome or not.
     * https://www.includehelp.com/java-programs/java-program-to-check-palindrome-number-using-class.aspx
    */
    public static void main(String[] args) {
        int negru, maro, alb = 0, gri;
        Scanner s = new Scanner(System.in);
        System.out.print("Introdu' un numar:");
        negru = s.nextInt();
        maro = negru;
        while(negru > 0)
        {
            gri = negru % 10;
            alb = alb * 10 + gri;
            negru = negru / 10;
        }
        if(alb == maro) {
            System.out.println("Numarul "+maro+" este Palindrom");
        }
        else {
            System.out.println("Numarul "+maro+" nu este Palindrom");
        }
    }
}
