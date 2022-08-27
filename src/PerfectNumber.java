import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

        Scanner scan=new Scanner(System.in);

        int input=scan.nextInt();


        pozitifTamBolenler(input);
    }

    private static void pozitifTamBolenler(int input) {

        int result=0;
        for (int i = 1; i <input ; i++) {

            if(input%i==0){

                result+=i;
            }

        }

        if(result==input){
            System.out.println("girilen sayi mukemmel sayidir");
        }else {System.out.println("girilen sayi mukemmel sayi degildir");}
    }
}
