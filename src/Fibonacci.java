import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

        Scanner scan=new Scanner(System.in);

        int input= scan.nextInt();

        Integer first=0;

        Integer second=1;

        List<Integer> fibonacci=new ArrayList<>();

        fibonacci.add(first);
        fibonacci.add(second);

        fibonacci(fibonacci,input);




    }

    private static void fibonacci(List<Integer> fibonacci, int input) {

       while (fibonacci.get(fibonacci.size() - 2) +fibonacci.get( fibonacci.size() - 1)<input) {
           fibonacci.add(fibonacci.get(fibonacci.size() - 2) +fibonacci.get( fibonacci.size() - 1));
       }

        System.out.println("fibonacci = " + fibonacci);
    }




}
