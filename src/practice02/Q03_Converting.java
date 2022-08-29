package practice02;

import java.util.Scanner;

public class Q03_Converting {

    public static void main(String[] args) {

        int gallon = 1000;
        double litre = gallon * 3.785;
        String sonuc1 = gallon +"galon degeri" + litre + "litreye esittir";
        System.out.println(sonuc1);



       int l =1000;
       double G =l/3.785;
        System.out.println(l + "Litre degeri" + litre + " Litreye esittir");


        Scanner scan=new Scanner(System.in);
        System.out.println("fahrenayt degeni giriniz :");
         double fh= scan.nextDouble();

        System.out.println("girdigini fahrenayt degeri :  " + fh + " karsiligi " + (fh-32)*5/9 + "  santigrat derecedir. ");



        }







    }








