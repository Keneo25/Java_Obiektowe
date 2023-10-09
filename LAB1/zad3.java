import java.util.Scanner;

public class zad3 {
    public static void main(String arg[]){
        System.out.println("Podaj 4 liczby: ");
        Scanner input = new Scanner(System.in);

        System.out.print("1 liczba: ");
        double a = input.nextDouble();

        System.out.print("2 liczba: ");
        double b = input.nextDouble();

        System.out.print("3 liczba: ");
        double c = input.nextDouble();

        System.out.print("4 liczba: ");
        double d = input.nextDouble();

        System.out.print("Wynik dodawania: " + (a+b+c+d));

    }
}
