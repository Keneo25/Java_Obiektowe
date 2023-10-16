import java.util.Scanner;

public class zad3 {
    public static void main(String arg[]){
        System.out.println("Podaj liczbe od 1 do 7: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a >= 1 && a<=7){
            if(a == 1){
                System.out.println("Poniedziałek");
            }
            if(a == 2){
                System.out.println("Wtorek");
            }
            if(a == 3){
                System.out.println("Środa");
            }
            if(a == 4){
                System.out.println("Czwartek");
            }
            if(a == 5){
                System.out.println("Piątek");
            }
            if(a == 6){
                System.out.println("Sobota");
            }
            if(a == 7){
                System.out.println("Niedziela");
            }
        }
        else{
            System.out.println("Niepoprawny numer dnia tygodnia");
        }
    }
}
