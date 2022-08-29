package practice06;

import java.util.Scanner;

public class C01_ForLoop {  // 5.gunun 3.sorusu
    /*
           Get the number of rows and columns from user. //Kullanıcıdan satır ve sütun sayısını alın
           Create a rectangle. // Bir dikdörtgen oluşturun
           rows (satir)  = 3 and column (sutun)
                                = 5 ==> * * * * *
                                       * * * * *
                                       * * * * *
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Satir sayisi giriniz :");

        int satirSayisi = scan.nextInt();
        System.out.print("Sutun sayisi giriniz :");

        int sutunSayisi = scan.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {
            for (int k = 1; k <= sutunSayisi; k++) {
                System.out.print("* ");
            }
            System.out.println(); //bu bosluk olmazsa hepsini yan yana yazar
        }
    }












}
