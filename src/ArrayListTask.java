import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTask {

    // Part1:
    // Create an arraylist of Strings
    // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
    // print out all the elements, each element on new line

    // Part2:
    // Create a method that accepts a String arraylist and a String as parameters
    // method should add the element at the first index of arraylist

    // Part3:
    // Create a method that accepts a String arraylist and a String as parameters
    // it should add element before last element
    // ex:  [1, 2, 3]  -> [1, 2, 4, 3]

    public static void main(String[] args) {

        //1
        List<String> list=new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        for (String each: list) { System.out.println(each); }

        //2

        ilkindexeElementEkleme(list);

        System.out.println("list = " + list);

        sondanBirOncekiindexeElementEkleme(list);

        System.out.println("list = " + list);


    }

    private static List<String> sondanBirOncekiindexeElementEkleme(List<String> list) {

        list.add(list.size()-1,"sondan bir once");


        return list;
    }

    private static List<String> ilkindexeElementEkleme(List<String> list) {

        list.add(0,"element");


        return list;
    }
}
