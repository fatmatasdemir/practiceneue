package java_sorucevap;

public class C02 {
    public static void main(String[] args) {
/*
        Create 3 String variables for people's names. Print the sum of the number of characters in
        all the 3 names except space characters.
        Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        Kişi adları için 3 String değişkeni oluşturun.
        Boşluk karakterleri hariç tüm 3 addaki karakter
        sayısının toplamını yazdırın. Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.



        */


        String name1 = "Ali Can";
        String name2 = "Aliye Canan";
        String name3 = "Aliyev Can Cananov";
        Integer c1 = name1.replaceAll("\\s", "").length();
        Integer c2 = name2.replaceAll("\\s", "").length();
        Integer c3 = name3.replaceAll("\\s", "").length();
        System.out.println("Total number of characters different from space: " + (c1 + c2 + c3));


      // Total number of characters different from space: 32
     //Boşluktan farklı toplam karakter sayısı ----->32


    }
}