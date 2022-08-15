import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForFlashBack {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan=new Scanner(System.in);
        String input= scan.nextLine();

        String[] list=input.split("");
        System.out.println(Arrays.toString(list));

        String charInput=scan.next();

        int count=0;

        for (int i = 0; i <list.length ; i++) {

            if(list[i].equals(charInput)){
                count++;
            }

        }
        System.out.println("count = " + count);

        count=0;



    }
}
