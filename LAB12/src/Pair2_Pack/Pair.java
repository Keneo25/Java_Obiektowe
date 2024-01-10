package Pair2_Pack;

public class Pair<T> {
    T pierwszy;
    T drugi;

    public Pair(T pierwszy, T drugi) {
        this.pierwszy = pierwszy;
        this.drugi = drugi;
    }

    public T getPierwszy() {
        return pierwszy;
    }

    public void setPierwszy(T pierwszy) {
        this.pierwszy = pierwszy;
    }

    public T getDrugi() {
        return drugi;
    }

    public void setDrugi(T drugi) {
        this.drugi = drugi;
    }
}
