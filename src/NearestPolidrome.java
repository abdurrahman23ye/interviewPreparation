import java.util.ArrayList;
import java.util.List;

public class NearestPolidrome {



    public static void main(String[] args) {

        Integer input = 122;
        Integer keepInput = 122;
        List<Integer> numbers = prepareList(input);


        boolean flag = true;
        int count = 0;

        while (flag) {


            for (int i = 0; i < numbers.size(); i++) {




                if (numbers.get(i) == numbers.get(numbers.size() - 1 - i)) {

                    count++;
                }}

                if (count == numbers.size()) {



                    flag = false;

                }

                count=0;
                numbers=prepareList(++input);

        }

        int result1=input-1;

        input=keepInput;
        numbers = prepareList(input);
        flag=true;

        while (flag) {


            for (int i = 0; i < numbers.size(); i++) {




                if (numbers.get(i) == numbers.get(numbers.size() - 1 - i)) {

                    count++;
                }}

            if (count == numbers.size()) {



                flag = false;

            }

            count=0;
            numbers=prepareList(--input);

        }

        int result2=input+1;

        int result= result1-keepInput<keepInput-result2?result1:result2;

        System.out.println(result);



    }







    public static List<Integer>  prepareList(Integer input){

        List<Integer> numbers = new ArrayList<>();


        while (input > 0) {

            numbers.add(input%10);

            input /= 10;}

        return numbers;}



    }



