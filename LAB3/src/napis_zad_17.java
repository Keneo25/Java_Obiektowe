public class napis_zad_17 {
    public static void capitalizeEverySecond(StringBuffer text) {
        for (int i = 1; i < text.length(); i += 2) {
            char currentChar = text.charAt(i);
            if (Character.isLetter(currentChar)) {
                char capitalizedChar = Character.toUpperCase(currentChar);
                text.setCharAt(i, capitalizedChar);
            }
        }
    }

    public static void main(String[] args) {

        StringBuffer text = new StringBuffer("to jest przykład tekstu");
        capitalizeEverySecond(text);

        System.out.println("Oryginalny tekst: " + text);
    }


}
