package java_sorucevap;

public class C05 {

    public static void main(String[] args) {

      /*  Create a String variable and print just the last non-space character on the console for any
        String.
                Example: For ‘Ali Can’ you should print n
        For ‘Miami ’ you should print i etc.

        Bir String değişkeni oluşturun ve herhangi
         bir String için konsoldaki boşluk olmayan son karakteri yazdırın.
         Örnek: 'Ali Can' için n yazdırmalısınız 'Miami' için i vb. yazdırmalısınız.


       */
        String s = "Miami ";
        int idxOfLastNonSpace = s.trim().length()-1;
        String lastNonSpaceChar = s.substring(idxOfLastNonSpace, idxOfLastNonSpace+1);
        System.out.println("The non-space last character: " + lastNonSpaceChar); // i yazdirir
       // Boşluk olmayan son karakter -----> i




    }
}
