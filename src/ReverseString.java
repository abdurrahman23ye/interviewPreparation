import java.util.Arrays;
import java.util.Comparator;

public class ReverseString {

    public static void main(String[] args) {
        /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

        StringBuilder sb=new StringBuilder();

        sb.append("sanki boyleydi");

        System.out.println(sb.reverse());

        String input="sanki boyleydi";

        String[] ipt=input.split("");

        String reverse="";

        for (int i = ipt.length-1; i >=0 ; i--) {

            reverse+=ipt[i];

        }

        System.out.println("reverse = " + reverse);
        
        
        stringReverse(input);
    }

    private static void stringReverse(String input) {

         input="sanki boyleydi";

        String[] ipt=input.split("");

        String reverse="";

        for (int i = ipt.length-1; i >=0 ; i--) {

            reverse+=ipt[i];

        }

        System.out.println("reverse = " + reverse);
    }
}
