import java.util.Scanner;

public class CountRepeat {

    public static void main(String[] args) {
          /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */

        Scanner scan=new Scanner(System.in);

        String input=scan.next();
        String check= scan.next();

        String[] inputCheck=input.split("");

        int count=0;

        for (int i = 0; i <inputCheck.length ; i++) {

            if(inputCheck[i].equals(check)){count++;}

        }

        System.out.println("count = " + count);

    }
}
