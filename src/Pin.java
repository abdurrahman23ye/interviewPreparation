import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan=new Scanner(System.in);

        String input=scan.next();
        String pin="ali";

        int number=4;
        int count=0;
        int chech=0;
        boolean flag=true;

        while(number>count){

            for (int i = 0; i <input.length() ; i++) {
                for (int j = 0; j <pin.length() ; j++) {

                    if(input.charAt(i)==pin.charAt(j)){

                        chech++;
                    }

                }
            } if(chech==input.length() && chech==pin.length()){

                System.out.println("sifreniz dogru"); break;
            } else {
                System.out.println("tekrar deneyiniz");
                input=scan.next();
                chech=0;
            }



            count++;
        }



    }
}
