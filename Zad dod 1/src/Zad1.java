import java.util.Scanner;

public class Zad1 {
    public static void main(String arg[]){

        System.out.print("Podaj liczbe a: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Podaj liczbe b: ");
        int b = input.nextInt();

        for(int i = a+1; i<b;i++){
            System.out.println("Liczba pomiedzy nimi "+ i);
        }


    }

}