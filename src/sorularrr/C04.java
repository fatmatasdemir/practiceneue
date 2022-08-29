package sorularrr;

public class C04 {



    String isim;
    static String soyisim="soyisim belirtilmedi";

    int dogumTarihi;
    String kimlikNo ="kimlikNo belirtilmedi";
    String sinif="sinif belirtilmedi";
    String ogrenciNo="ogrenciNo belirtilmedi";



    public C04 (String isim, int dogumTarihi,                    //
                               String kimlikNo, String sinif, String ogrenciNo) {
        this();                                                                                 //
      this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        this.kimlikNo = kimlikNo;
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public C04 () {


    }

    public C04 (String isim, int dogumTarihi) {
        this.isim=isim;
        this.dogumTarihi=dogumTarihi;


    }

    @Override
    public String toString() {
        return "\n" +
                "\nisim= " + isim +
                "\nsoyisim= " + soyisim +
                "\ndogumTarihi= " + dogumTarihi +
                "\nkimlikNo= " + kimlikNo +
                "\nsinif= " + sinif +
                "\nogrenciNo= " + ogrenciNo +"\n";
    }

    public static void main(String[] args) {                                                         // 1.

        C04 ogrenci1= new C04 ("Selahhadin",       // 2
                2014,"12345*67**","3A","3241");
        System.out.println("ogrenci1 = " + ogrenci1);                                                // 3.

        System.out.println(" ");                                                                     // 4.





        C04  ogrenci2= new C04 ();                                      //
        System.out.println("ogrenci2 = " + ogrenci2);

        System.out.println(" ");                                                                 //




        C04  ogrenci3= new C04 ();                                    //

        ogrenci3.isim="Mehmet";
        ogrenci3.soyisim="Aktas";
        ogrenci3.dogumTarihi=1982;
        ogrenci3.kimlikNo="12345***765";
        ogrenci3.sinif="QA";
        ogrenci3.ogrenciNo="1234";
        System.out.println("ogrenci3 = " + ogrenci3);                                               //

        System.out.println(" ");                                                                    //

        C04 ogrenci4= new C04 ("Gonul", 2012);    //
        System.out.println("ogrenci4 = " + ogrenci4);                                                        //



    }

}











