import java.util.Scanner;

public class zad2 {
    public static void main(String arg[]){
        System.out.print("Podaj imie: ");
        Scanner input = new Scanner(System.in);
        String imie = input.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = input.nextLine();

        System.out.println("Twoje imie: " + imie);
        System.out.println("Twoje nazwisko: " + nazwisko);
    }
}
