import java.util.Scanner;

public class zad5 {
    public static void main(String arg[]){
        System.out.println("Podaj wiek: ");
        Scanner scanner = new Scanner(System.in);
        int wiek = scanner.nextInt();


        if(wiek < 18){
            System.out.println("Jestes niepełnoletni");
        } else if (wiek >= 18 && wiek < 65) {
            System.out.println("Jestes dorosły");
        } else if (wiek >= 65) {
            System.out.println("Jestes emerytem");
        }
        {

        }
    }
}
