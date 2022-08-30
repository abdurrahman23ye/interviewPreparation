import java.util.Objects;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
         /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */

        Scanner scan=new Scanner(System.in);

        String input=scan.nextLine();

        palindromeCheck(input);
    }

    private static void palindromeCheck(String input) {

        String[]inputCheck=input.split("");
        boolean flag=true;

        for (int i = 0; i <inputCheck.length ; i++) {

            if(!inputCheck[i].equals(inputCheck[inputCheck.length - 1 - i])){
               flag=false;

                System.out.println("i = " + i);

            }


                }
        if(flag){
            System.out.println("Girdiginiz ifade bir palindromdur");
        }else {

            System.out.println("Girdiginiz ifade bir palindrom degildir");
            }




        }
    }
