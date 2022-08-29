package practice06;

import java.util.Scanner;

public class C05_DoWhileLoop {
    public static void main(String[] args) {


/*
Ask user to enter a word. If the word has odd number of characters
 and has 3 or more characters,
 print the character in the middle of the word.
 the word has even number of character print "You entered wrong word."

 Kullanıcıdan bir kelime girmesini isteyin.
  Sözcüğün tek sayıda karakteri varsa ve 3 veya daha fazla karakteri varsa,
   karakteri sözcüğün ortasına yazdırın.
  kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."




     INPUT      :   celik
     OUTPUT    :   l
     INPUT      :   elif
     OUTPUT    :   You entered wrong word.   yanlış kelime girdin              */







        Scanner scan = new Scanner(System.in);
        String word ="";
        do {
            System.out.println("lutfen bir kelime giriniz :");
            word = scan.nextLine();
            if(word.length()<3){
                System.out.println("girilen word 3 karakterden az");
            }if(word.length()%2==1  && word.length()>=3){
                System.out.println("ortadaki karakter :" +word.charAt(word.length()/2));
            }else{
                System.out.println("You entered wrong word/ yanlis kelime girdiniz");
            }
        }while(!(word.length()%2==1  && word.length()>=3));
    }
}










