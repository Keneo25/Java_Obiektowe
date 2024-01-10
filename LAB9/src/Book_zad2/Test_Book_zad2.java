package Book_zad2;

public class Test_Book_zad2 {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book.addReview(4.5);
        book.addReview(5.0);
        book.addReview(3.5);

        System.out.println("Book Information:");
        System.out.println(book);

        book.removeReview(1);

        System.out.println("Book Information after removing a review:");
        System.out.println(book);


        FantasyBook fantasyBook = new FantasyBook("The Hobbit", "J.R.R. Tolkien", "High Fantasy");
        fantasyBook.addReview(4.8);

        System.out.println("FantasyBook Information:");
        System.out.println(fantasyBook);
    }
}
