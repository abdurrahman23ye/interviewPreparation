import java.util.Scanner;

public class HackerLanguage {
    public static void main(String[] args) {

// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

        Scanner scan=new Scanner(System.in);

        String input=scan.nextLine();

        cevirme(input);
    }

    private static void cevirme(String input) {

        String[] cevirme= input.split("");

        String result="";

        boolean none=true;

        for (String each:cevirme
             ) {

            if(each.equals("s")){result+="5"; none=false;}
            if(each.equals("a")){result+="4";none=false;}
            if(each.equals("e")){result+="3";none=false;}
            if(each.equals("i")){result+="1";none=false;}
            if(each.equals("0")){result+="0";none=false;}
            if(none){ result+=each;}
            none=true;



        }


        System.out.println("result = " + result);}
}
