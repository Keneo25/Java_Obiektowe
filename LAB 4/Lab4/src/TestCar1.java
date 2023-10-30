public class TestCar1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 100;
        car.accelerate(10);
        System.out.println(car.speed);
        car.decelerate(10);
        System.out.println(car.speed);



    }

}
    class Car{
        String brand;
        String model;
        int speed;

        public void accelerate(int value){
            this.speed = speed + value;
        }

        public void decelerate(int value){
            this.speed = speed -value;
        }

    }


