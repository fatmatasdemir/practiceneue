package java_sorucevap;

public class C06 {
    public static void main(String[] args) {

        /*Create a String variable and find the sum of the ASCII values of the first and the last
        characters of the String.
        Bir String değişkeni oluşturun ve String'in ilk ve son karakterlerinin ASCII değerlerinin toplamını bulun.

         */

        String s = "Miami";
        int indexOfLastChar = s.length()-1;
        int AsciiOfFirst = s.charAt(0);
        int AsciiOfLast = s.charAt(indexOfLastChar);
        System.out.println("Total ASCII values of first and last chars: " + (AsciiOfFirst + AsciiOfLast)); // 182
    // Ilk ve son karakterlerin toplam ASCII değerleri:     182

    }
}
