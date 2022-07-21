public class sixFactors {

    public static void main(String[] args) {

        int input=6;

        for (int i = 1; i <=input-1 ; i++) {

            if(input % i==0){
                System.out.print(i+",");
            }
            }
        if(input %input==0){
            System.out.print(input);

        }
    }
}
