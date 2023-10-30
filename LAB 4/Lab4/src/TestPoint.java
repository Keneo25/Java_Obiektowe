import static java.lang.Math.abs;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.y = 20;
        point.x = 30;
        Point point1 = new Point();
        point1.y = 40;
        point1.x = 60;
        int wyn  = point.distance(point1);
        System.out.println(wyn);


    }


}

    class Point{
        int x;
        int y;


        public int distance(Point otherPoint){
                  return abs(x - otherPoint.x) + abs(y - otherPoint.y);
        }

    }




