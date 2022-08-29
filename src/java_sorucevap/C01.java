package java_sorucevap;

public class C01 {
    public static void main(String[] args) {
  /*
        Type code to draw the following image by using a for loop.
        Bir for döngüsü kullanarak aşağıdaki resmi çizmek için kod yazın.
        A
        A A
        A A A
        A A A A


    */
        int rows = 4;
        for(Integer i=1; i<=rows; i++){
            String s = "";
            for(Integer k=1; k<=i; k++){
                s = s + "A ";
            }
            System.out.println(s);
        }


      //
        /* 2.Way:
        int rows1 = 4; //YUKARIDAKININ 2:COZUM YOLU
        int i=1;
        while(i<=rows) {
            String s = "";
            for (int k = 1; k <= i; k++) {
                s = s + "A ";
            }
            System.out.println(s);

            i++;


        }

*/
    }






}
