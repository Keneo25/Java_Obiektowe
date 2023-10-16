import java.util.Scanner;

public class Zad1 {
    public static void main(String arg[]){

        System.out.print("Podaj liczbe a: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a % 2 == 0){
            System.out.println("Liczba jest parzysta");
        }
        else
        System.out.println("Liczba nie jest parzysta");

    }
}