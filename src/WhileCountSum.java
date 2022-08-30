import java.util.Scanner;

public class WhileCountSum {

    public static void main(String[] args) {
        //  Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
        // bu kadar sayi yeter
        // ".. adet sayi girdin, toplami..." yazdirin


        Scanner scan=new Scanner(System.in);
        int count=0;
        int result=0;
        while (count<10 && result<500){

            result+= scan.nextInt();

            count++;
        }

        System.out.println(count +" adet sayi girdin. Bu sayilarin toplami: "+result);
    }
}
