import java.util.ArrayList;
import java.util.Scanner;

public class lista_zad_1 {
    public static void main(String arg[]) {
        int[] tablica = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print( (i + 1) + ",");
            tablica[i] = i + 1;
        }

        System.out.println("\n Liczby w odwrotnym porzadku:");

        for (int i = 9; i >= 0; i--) {
            System.out.print(tablica[i]+ ",");
        }



    }
}
