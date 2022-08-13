import java.util.Scanner;

public class MergeCertainCharacters {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scan=new Scanner(System.in);

        String input=scan.next();
        int number=scan.nextInt();

        String firstLetter= input.substring(0,1);
        String lastLetter= input.substring(input.length()-1);

      String Result=  result(firstLetter,lastLetter,number);
        System.out.println("Result = " + Result);


    }

    private static String result(String firstLetter, String lastLetter, int number) {
        int count=0;
        String result="";
    while(number>count){

        result+=firstLetter;
        result+=lastLetter;

        count++;


    }


    return result;}
}

