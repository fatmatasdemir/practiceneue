package java_sorucevap;

public class C07 {


    public static void main(String[] args) {

      /*  Type code to check if a String has an uppercase initial and dot at the end.
                Example: For ‘Ali’ your code should print false on the console
        For ‘ali.’ your code should print false on the console

        For ‘Ali.’ your code should print true on the console
        For ‘ALI.’ your code should print true on the console


        Bir Dize'nin başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazın.
         Örnek: 'Ali' için kodunuz konsolda false yazmalıdır '
         'ali.' için kodunuz konsolda false yazmalıdır
        'Ali.' için kodunuz konsolda false yazmalıdır.

        'ALI' için kodunuz konsolda true olarak yazdırılmalıdır.

        */



        String s = "Tom Hanks.";

        char firstChar = s.charAt(0);

        char lastChar = s.charAt(s.length()-1);
        Boolean isTheFirstCharUpper = firstChar>='A' && lastChar<='Z';
        Boolean isTheLastCharDot = lastChar=='.';
        Boolean isFirstUpperAndLastDot = isTheFirstCharUpper && isTheLastCharDot;
        System.out.println("Is the first char upper and the last char dot? " + isFirstUpperAndLastDot); // TRUE

       // İlk karakter üstte ve son karakter noktası mı? doğru   -----

      //  isTheFirstCharUpper___> İlk Karakter Üst
       // isTheLastCharDot___> Son Karakter Noktası

        

    }
}
