package practice03;

import java.util.Scanner;

public class pratice2072022 {

    public static void main(String[] args) {


       //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi giriniz");
        
        String firstName= scan.nextLine(),lastName=scan.nextLine(); // Multiple declaration
        
        String fullName=firstName.concat(" " + lastName).toUpperCase();

        System.out.println("fullName = " + fullName);

        
        
        
    }
}