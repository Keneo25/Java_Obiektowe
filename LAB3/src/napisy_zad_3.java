

public class napisy_zad_3 {
    public static String removeSpaces(String input) {
        return input.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        String textWithSpaces = "Jakis tam tekst.";
        String textWithoutSpaces = removeSpaces(textWithSpaces);

        System.out.println("Oryginalny: " + textWithSpaces);
        System.out.println("Napis bez spacji: " + textWithoutSpaces);
    }
}
