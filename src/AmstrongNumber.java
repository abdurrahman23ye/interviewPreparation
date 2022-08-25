import java.util.Scanner;

public class AmstrongNumber {

     /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        sayininBasamaklarininKupununToplami(input);
    }

    private static void sayininBasamaklarininKupununToplami(int input) {
        int numbers=0;
        int result=0;
        while (input>0){

            numbers=input%10;
            result+=numbers*numbers*numbers;

            input = input/10;

        }

        System.out.println("result = " + result);
    }
}
