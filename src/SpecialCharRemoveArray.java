import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialCharRemoveArray {

    public static void main(String[] args) {
/*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */


        List<String> list=new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        List<String> list2=new ArrayList<>(Arrays.asList("$-13", "$0", "$0"));

       int result= getSum(list2);


        if(result>=0){
            System.out.println("result = " + result);
        }else {
            System.out.println("-1");
        }
    }

    private static int getSum(List<String> list) {

        int result=0;

        for (String each:list
             ) {

            result+=Integer.valueOf(each.replace("$",""));

        }



        return result;
    }
}
