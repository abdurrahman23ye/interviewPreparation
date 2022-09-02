public class MultipleMethodVarargs {

    public static void main(String[] args) {


        /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */

        String isim="";
        int notlar=0;



        ortalamabul("ayse",15,24,34,23,23,34);
        ortalamabul("fatma",34,23,23,34);
        ortalamabul("ali",34,23,34);
        ortalamabul("veli",34,23,34,34,23);

}

    private static void ortalamabul(String isim, int ...notlar) {
        double ortalama=0;
        double toplam=0;
        for (int each: notlar
             ) {

            toplam+=each;
        }

        ortalama=toplam/notlar.length;

        System.out.println("ortalama = " + ortalama);
    }



}
