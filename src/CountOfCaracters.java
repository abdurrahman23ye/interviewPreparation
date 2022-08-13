import java.util.*;

public class CountOfCaracters {

    public static void main(String[] args) {
        /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        Scanner scan=new Scanner(System.in);
        String input= scan.next();

        List<String> charList= List.of(input.split(""));
        Map<String,Integer> charCount=new HashMap<>();

        Integer count=0;

        for (int i = 0; i <charList.size() ; i++) {
            for (int j = 0; j <charList.size() ; j++) {

                if(charList.get(i).equals(charList.get(j))){

                    count++;
                }

            }
            charCount.put(charList.get(i),count);
            count=0;



        }
        System.out.println("charCount = " + charCount);



    }
}
