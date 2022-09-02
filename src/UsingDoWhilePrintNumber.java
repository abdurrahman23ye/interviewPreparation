public class UsingDoWhilePrintNumber {

    public static void main(String[] args) {

        /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

        int input=0;

        do {
            System.out.print(input+" ");

            input+=5;
        }while (input<100);

    }
}
