package practiceDay07;

import java.util.Arrays;
import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

         /*

   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/

        farkiniBul();

    }

    public static void farkiniBul() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz");

        int uzunluk=scanner.nextInt();
        int arr[]=new  int [uzunluk];

        for (int i = 0; i <uzunluk ; i++) {

            System.out.println("arrayin  " +  (i+1) + ". elemanini giriniz : ");
            // i----> oldugunda 0. eleman diyecek, biz index degil direkt eleman sorduk (i+1) YAZDIK

            arr[i]=scanner.nextInt();
            // fori den gelen indexler, bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur

        }

        Arrays.sort(arr);
        System.out.println("arraydeki en buyuk eleman ile en kucuk eleman arasindaki fark :" + (arr[uzunluk-1] -arr[0]));

    }


}


// ekran ciktisi
   // array uzunlugunu giriniz ----->4

//arrayin  1. elemanini giriniz :
//3
//arrayin  2. elemanini giriniz :
//15
//arrayin  3. elemanini giriniz :
//87
//arrayin  4. elemanini giriniz :
//90
//arraydeki en buyuk eleman ile en kucuk eleman arasindaki fark :87














