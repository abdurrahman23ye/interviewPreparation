import java.util.Scanner;

public class CountFactors {

    public static void main(String[] args) {
          /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();

        int count=0;
        int next=1;

        while (next<=input){

            if(input%next==0){count++;}
            next++;
        }
        System.out.println("count = " + count);
    }
}
