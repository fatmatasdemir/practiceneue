package sorularrr;

public class Takimlar2 {




        String takim = "Takim belirtilmedi"; // 1
        String renk;
        Takimlar2() {   // 3
        }
    public Takimlar2(String takim, String renk) {  // 5
            this.takim = takim;
            this.renk = renk;
        }
        @Override
        public String toString () {   // 6
            return
                    "takim : " + takim +
                            "\nrenk : " + renk;
        }


    public static void main(String[] args) {  // RUNNER CLASS




    Takimlar2 tkm = new Takimlar2();  // 2
    Takimlar2 tkm2 = new Takimlar2("Efes","Mavi-Beyaz"); // 4


        System.out.println(tkm);  // 7
        System.out.println(tkm2); // 8

}

}
