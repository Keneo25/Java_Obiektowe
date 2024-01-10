package Drawable_Pack;

public class DrawableTester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.draw());
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.draw());
        System.out.println(Drawable.getType());
        System.out.println(circle.display());
    }
}
