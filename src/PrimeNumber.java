import java.util.Scanner;

public class PrimeNumber {

    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input= scan.nextInt();
        int check=0;

        for (int i = 2; i <input ; i++) {

            if(input%i==0){

              check++;
            }}

            if(check==0){
                System.out.println(input+" is a prime number");
            }else {  System.out.println(input+" is not a prime number");}


    }




}
