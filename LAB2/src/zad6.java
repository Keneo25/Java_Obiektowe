public class zad6 {
    public static void main(String arg[]){
        int rok = 2024;
        String rok_str = Integer.toString(rok);

        if(rok_str.length() == 4){
            if((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0){
                System.out.println("Rok jest przestepny");
            }
            else{
                System.out.println("To nie jest rok przestepny");
            }
        }

    }
}
