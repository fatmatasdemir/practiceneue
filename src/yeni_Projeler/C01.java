package yeni_Projeler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C01 {
      /*
    Girilen Sayı Formatındaki Tarihi Metne Çeviren Uygulama

 10.03.2008 şeklinde girilen tarih ay, gün, yıl

 olarak ayrılıp ilgili değerler dizi indexi olarak kullanılıyor.
       konsola boyle yazin 10.03.2008   ------> konsolda on mart ikibinsekiz yazacak
     */



    public static void main(String[] args) throws IOException {

        String[] aylar = {"", "ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz",
                "agustos", "eylul", "ekim", "kasim", "aralik"};
        String[] birler = {"", "bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"};
        String[] onlar = {"", "on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"};
        String[] yuzler = {"", "yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz",
                "sekizyuz", "dokuzyuz"};
        String[] binler = {"", "bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin",
                "sekizbin", "dokuzbin"};
        String tarih;

       BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        tarih = a.readLine();

        int ay =new Integer(tarih.substring(3,5));

        int bir = new Integer(tarih.substring(1, 2));

        int on = new Integer(tarih.substring(0, 1));

        int yilbinler = new Integer(tarih.substring(6, 7));

        int yilyuzler = new Integer(tarih.substring(7, 8));

        int yilonlar = new Integer(tarih.substring(8, 9));

        int yilbirler = new Integer(tarih.substring(9, 10));

        System.out.println(onlar[on] + birler[bir] + " " + aylar[ay] + " "
                + binler[yilbinler] + yuzler[yilyuzler] + onlar[yilonlar] + birler[yilbirler]);

    }
}      //10.03.2008 şeklinde girilen tarih ay, gün, yıl  ------> konsolda on mart ikibinsekiz yazacak

















