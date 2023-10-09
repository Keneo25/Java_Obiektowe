import java.util.Scanner;

public class zad1 {
    public static void main(String  arg[]){
        System.out.println("Hello Konrad");
        System.out.println("Kalkulator");
        System.out.print("Podaj pierwsza liczbe: ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        System.out.print("Podaj druga liczbe: ");
        int b = input.nextInt();
        System.out.println("Dodawanie: " + (a+b));
        System.out.println("Odejmowanie: " + (a-b));
        System.out.println("Dzielenie: " + (a/b));
        System.out.println("Mnożenie: " + (a*b));
    }
}
