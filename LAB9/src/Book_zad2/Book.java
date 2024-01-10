package Book_zad2;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private double[] reviews;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.reviews = new double[0];
    }


    public void addReview(double review) {
        double[] newReviews = Arrays.copyOf(reviews, reviews.length + 1);
        newReviews[reviews.length] = review;
        reviews = newReviews;
    }


    public void removeReview(int index) {
        if (index >= 0 && index < reviews.length) {
            double[] newReviews = new double[reviews.length - 1];
            System.arraycopy(reviews, 0, newReviews, 0, index);
            System.arraycopy(reviews, index + 1, newReviews, index, reviews.length - index - 1);
            reviews = newReviews;
        }
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double[] getReviews() {
        return Arrays.copyOf(reviews, reviews.length);
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + Arrays.toString(reviews) +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) &&
                author.equals(book.author) &&
                Arrays.equals(reviews, book.reviews);
    }


    @Override
    public int hashCode() {
        int result = Arrays.hashCode(reviews);
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}


class FantasyBook extends Book {
    private String fantasySubgenre;


    public FantasyBook(String title, String author, String fantasySubgenre) {
        super(title, author);
        this.fantasySubgenre = fantasySubgenre;
    }


    public String getFantasySubgenre() {
        return fantasySubgenre;
    }

    public void setFantasySubgenre(String fantasySubgenre) {
        this.fantasySubgenre = fantasySubgenre;
    }


    @Override
    public String toString() {
        return "FantasyBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", fantasySubgenre='" + fantasySubgenre + '\'' +
                ", reviews=" + Arrays.toString(getReviews()) +
                '}';
    }


}