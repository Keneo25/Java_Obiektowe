public class Zad {
    public static <T> void printArrayElements(T[] arr){
        if(arr == null || arr.length == 0){
            System.out.println("Pusta tablica");
        }
        else if (arr != null || arr.length != 0) {
            for(int i = 0; i < arr.length ; i++){
                System.out.println(arr[i]);
            }
        }

    }
}
class Test{
    public static void main(String[] args) {
        Integer[] liczba = {};
        Integer[] liczba2 = {3,6,9,23,76,4,8};

       Zad.printArrayElements(liczba);
       Zad.printArrayElements(liczba2);

    }
}
