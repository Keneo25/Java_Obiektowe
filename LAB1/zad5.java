import java.util.Scanner;

public class zad5 {
    public static void main(String arg[]){
            System.out.print("Podaj liczbe a: ");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            System.out.print("Podaj liczbe b: ");
            int b = input.nextInt();

           System.out.print("Podaj liczbe c: ");
           int c = input.nextInt();

           System.out.print("Podaj liczbe x: ");
           int x = input.nextInt();

           System.out.println("Wynik obliczen a+b-x^2: "+ (a+b-Math.pow(x,2)));

           System.out.println("Wynik obliczen (a-b)/(c-3): "+ (a-b)/(c-3));

           System.out.println("Wynik obliczen 3(4+5*a)(b-c^3): "+ 3*(4+5*a)*(b-Math.pow(c,3)));


    }

}
