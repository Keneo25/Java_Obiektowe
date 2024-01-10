package Drawable_Pack;

public interface Drawable {

    abstract String draw();

    default String display() {
        return "Displaying Drawable";
    }
    static String getType(){
        return "Drawable Type";
    }
}

class Circle implements Drawable{
    @Override
    public String draw() {
        return "Displaying Circle";
    }
}

class Rectangle implements Drawable{

    @Override
    public String draw() {
        return "Displaying Rectangle";
    }


}
