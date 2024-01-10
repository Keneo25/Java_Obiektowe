package Box_Pack;

public class Box<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
class BoxTest{
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setT("Siema");
        String t = stringBox.getT();
        System.out.println("Zawarość pudełka: " + t);

        Box<Integer> integerBox = new Box<>();
        integerBox.setT(45);
        int intValue = integerBox.getT();
        System.out.println("Zawarośc pudełka: " + intValue);

    }
}
