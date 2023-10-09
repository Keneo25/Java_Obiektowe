import java.util.Scanner;

public class zad4 {
    public static void main(String arg[]){
        System.out.print("Podaj liczbe: ");
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        System.out.println("Pole kwadratu wynosi: " + (liczba*liczba));


    }
}
