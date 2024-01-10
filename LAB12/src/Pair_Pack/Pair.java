package Pair_Pack;

public class Pair<T> {
    T age1;
    T age2;

    public Pair(T age1, T age2) {
        this.age1 = age1;
        this.age2 = age2;
    }

    public T getAge1() {
        return age1;
    }

    public void setAge1(T age1) {
        this.age1 = age1;
    }

    public T getAge2() {
        return age2;
    }

    public void setAge2(T age2) {
        this.age2 = age2;
    }


}
