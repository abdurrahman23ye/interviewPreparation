import java.util.Arrays;

public class DifferentArraysLargestAndSmallestElement {

    public static void main(String[] args) {
         /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

        int[] arr={1,4,6,9};

      int largestElement=Arrays.stream(arr).reduce(Math::max).getAsInt();
      int smallestElement=Arrays.stream(arr).reduce(Math::min).getAsInt();

        System.out.println(largestElement-smallestElement);

        largestElement=Integer.MIN_VALUE;
        smallestElement=Integer.MAX_VALUE;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>largestElement){largestElement=arr[i];}
            if(arr[i]<smallestElement){smallestElement=arr[i];}

        }
        System.out.println(largestElement-smallestElement);


    }
}
