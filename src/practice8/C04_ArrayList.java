package practice8;

import java.util.ArrayList;
import java.util.List;

public class C04_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {

        int [] arr={2,5,-9,45,43,11,8,102,47,0};
        int n=4;

        // bir liste olusturalim

        List<Integer> list=new ArrayList<>();
        // Listeye elemeanlari ekleyelim

        for (int each: arr){

            list.add(each);

        }

        List<Integer> maxList=new ArrayList<>();
        int count=1;

        while (count<=n){
            int max=list.get(0);  // list  ilk elemani max olsun

            for (int i = 0; i <list.size() ; i++) {

                if (list.get(i)>max){ // listenin herhangi bir elemani  max dan buyukse

                    max=list.get(i); // max artik o eleman olsun

                }


            }

            maxList.add(max);

            list.remove(list.indexOf(max)); // max liste ekledigim sayiyi artik listeden kaldiriyorum

            count++;


        }


        System.out.println("Arrayin max " + n +"elemani " + maxList); //Arrayin max 4elemani [102, 47, 45, 43]





    }










}
