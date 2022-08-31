import com.sun.source.doctree.SeeTree;

import java.util.*;

public class UniqueArray {

    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */

    public static void main(String[] args) {
      //1
        int[] arr={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

        Set<Integer> uniqueArr=new HashSet<>();
        Set<Integer> uniqueArr3=new HashSet<>();


        for (int each: arr
             ) {uniqueArr.add(each);}

        System.out.println("uniqueArr = " + uniqueArr);

        //2

        List<Integer> uniqueArr2=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if(!uniqueArr2.contains(arr[i])){

                uniqueArr2.add(arr[i]);
            }


        }
        System.out.println("uniqueArr2 = " + uniqueArr2);

        //3

        Arrays.stream(arr).forEach(t->uniqueArr3.add(t));

        System.out.println("uniqueArr3 = " + uniqueArr3);

    }
}
