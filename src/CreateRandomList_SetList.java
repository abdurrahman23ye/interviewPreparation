import java.util.ArrayList;
import java.util.Random;

public class CreateRandomList_SetList {

    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.



        ArrayList<Integer> list=new ArrayList<>();

        randomEkle(list);

        boolean listedeCiftSayiYok=true;

        for (Integer each:list
             ) { if(each==111){listedeCiftSayiYok=false;}

        }

        if(listedeCiftSayiYok){
            System.out.println("Listede cift sayi yoktur.");
        }
        System.out.println("list = " + list);


    }

    private static void randomEkle(ArrayList<Integer> list) {

        Random rnd=new Random();

        int random= rnd.nextInt(20);

        System.out.println("random = " + random);
        int count=0;
        while (count<10){

            random= rnd.nextInt(20);

            if(random%2==0){

                list.add(111);
            }else {

                list.add(random);
            }
            count++;
        }
    }
}
