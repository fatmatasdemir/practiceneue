package java_sorucevap;

public class C04 {

    public static void main(String[] args) {
/*
        Create a String variable, print the number of non-digit characters in the String on the
        console.
       Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.

       Bir String değişkeni oluşturun, konsoldaki String'deki rakam olmayan karakterlerin sayısını yazdırın.
        Örnek: Dize '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.



 */
        String s = "2a3B4?-!5";

        Integer numOfNonDigitChars = s.replaceAll("[0-9]","").length();
        System.out.println("Total number of non-digit characters: " + numOfNonDigitChars); // 5
      // SAYILAR DISINDAKI HERSEYI SAYIP KONSOLA YAZDI







    }






}
