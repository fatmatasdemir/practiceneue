package practice8;

public class C03_ForEach {

/*// String[] list = {"fruits", "vegetables", "meat", "milk"};
// print array with for each loop
// print length of each element

// Part 2:
// Print all the elements from array using for eachLoop
// If an element starts with 'v' then quit the loop

String[] list = {"meyveler", "sebzeler", "et", "süt"}; her döngü için dizi yazdır her öğenin uzunluğunu yazdır
Bölüm 2: for eachLoop kullanarak dizideki tüm öğeleri yazdırın Bir öğe 'v' ile başlıyorsa döngüden çıkın
*/
public static void main(String[] args) {

     // String[] list = {"fruits", "vegetables", "meat", "milk"}; // sorunun orjinali bu  1
    String[] list = {"fruits", "meat", "milk" ,"vegetables"  };
    for (String element:list){

        System.out.println(element + " : " + element.length() + " ");

        /* konsol ciktimiz 1.bölüm

        fruits : 6
       vegetables : 10
        meat : 4
        milk : 4
       */
    }

    System.out.println();  // fruits

       for (String item:list){
          if (item.startsWith("v")){
              break;
          }
           System.out.println(item);  // sorunun orjinalinde yazan     fruits
       }


            //  System.out.println(item); fruits
                                         //meat
                                         //milk




}


















}
