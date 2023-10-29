import java.util.Scanner;

public class napisy_zad_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj główny napis: ");
        String mainText = scanner.nextLine();

        System.out.print("Podaj prefiks: ");
        String prefix = scanner.nextLine();

        System.out.print("Podaj sufiks: ");
        String suffix = scanner.nextLine();

        if (mainText.startsWith(prefix)) {
            System.out.println("Główny napis zaczyna się od podanego prefiksu.");
        } else {
            System.out.println("Główny napis nie zaczyna się od podanego prefiksu.");
        }

        if (mainText.endsWith(suffix)) {
            System.out.println("Główny napis kończy się podanym sufiksem.");
        } else {
            System.out.println("Główny napis nie kończy się podanym sufiksem.");
        }
    }

}
