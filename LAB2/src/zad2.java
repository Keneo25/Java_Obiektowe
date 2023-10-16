import java.util.Scanner;

public class zad2 {
    public static void main(String arg[]){
      int a = 16;
      int b = 16;
      int c = 12;
      if(a > b && a > c){
          System.out.println("Liczba "+ a + " jest najwieksza A");
      } else if (b > a && b > c) {
          System.out.println("Liczba "+ b + " jest najwieksza B");
      }
      else if (c> a && c >b ){
          System.out.println("Liczba "+ c + " jest najwieksza C");
      } else if (a == b && a> c && b > c) {
          System.out.println("Liczby "+ a +" i "+ b + " są najwieksze A i B");
      } else if (a == c && a>b && c >b) {
          System.out.println("Liczby "+ a +" i "+ c + " są najwieksze A i C");
      } else if (b == c && c > a && b > a) {
          System.out.println("Liczby "+ b +" i "+ c + " są najwieksze B i C");
      } else if (a == b && b == c && a==c) {
          System.out.println("Są takie same");

      }


    }


}
