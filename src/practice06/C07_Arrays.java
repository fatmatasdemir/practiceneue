package practice06;

import java.util.Arrays;

public class C07_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

//arraylerde tüm data tipleri aynı olması lazım
        //arraylerin uzunlugu bize icindaki eleman sayisini verir
        //arrayler heap memory de run time da olusturulur
        //arrayler non primitivedir , bu yüzden kendilerine özel methodları vardır
        //bir array i declare ederken referansları stack memory de olusur


        String str="HeySiri";
          str=str.replace("Hey","Bye");

          String [] arr =new String[1];
          arr[0]=str;

          System.out.println(Arrays.toString(arr));



        }


    }



