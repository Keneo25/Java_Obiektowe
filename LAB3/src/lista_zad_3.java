import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class lista_zad_3 {
    public static int minimumValue(List<Integer> numbers){
        int min = numbers.get(0);

        for(int i = 1; i <numbers.size(); i++){
            if(numbers.get(i) < min){
                min = numbers.get(i);
            }
        }
        return min;

    }

    public static void main(String arg[]) {
       List<Integer> numbers = List.of(3,5,3,1,9,3,5);
       int min = minimumValue(numbers);
        System.out.println("Najmniejsza liczba w liście: " + min);



    }



}
