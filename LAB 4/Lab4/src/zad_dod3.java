public class zad_dod3 {
    public static void main(String[] args) {
        Car1  car1 = new Car1();
        Car1  car2 = new Car1();
        car1.setHordePower(2);
        String zmenna = car2.upgradeEngine(4);
        System.out.println(zmenna);

    }
}
    class Car1{
        private int horsePower;


        public void setHordePower(int value){
            horsePower = value;

        }

        public String upgradeEngine(int value1){
            return "String";

        }

    }


