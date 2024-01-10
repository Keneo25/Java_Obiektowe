package Book;

public class TestBook {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("Lalka","Bolesław Prus", 29.99, 300 );
        BookDTO book2 = new BookDTO("Dziady","Adam Mickiewicz", 59.99, 340 );
        BookDTO book3 = new BookDTO("Pan Tadeusz","Adam Mickiewicz", 80.99, 700 );


        System.out.println(book1 + "\n");
        System.out.println(book2 + "\n");
        System.out.println(book3);

    }


}
