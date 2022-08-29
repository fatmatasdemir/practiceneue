package java_sorucevap;

public class C03 {
    public static void main(String[] args) {

       /* Create a String variable, print the total number of alphabetical and numeric characters in
        the String on the console.
                Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.

         Bir String değişkeni oluşturun, konsoldaki String'deki toplam alfabetik ve sayısal karakter sayısını yazdırın.

          Örnek: Dize ' Miami 33018!!! ' konsolda 10 yazdırmanız gerekiyor.


        */
        String s = " Miami 33018!!! ";

        Integer numOfChars = s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("Total num of alphabetical and numeric characters chars:" + numOfChars); //10

        // Toplam alfabetik ve sayısal karakter karakter sayısı:10



    }













}
