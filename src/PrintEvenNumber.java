import java.util.Scanner;

public class PrintEvenNumber {

       /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int input= scan.nextInt();

        System.out.println(ifInputEven(input));
    }

    private static boolean ifInputEven(int input) {

        if(input%2==0) return true;
        else return false;
    }
}
