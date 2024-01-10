package Swap_Pack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;




public class Swaps {

    public static <T> void Swap(T[] array, int index1, int index2){
            if(array == null || index1 < 0 || index1 >= array.length || index2<0 || index2 >= array.length){
                System.out.println("Błąd");
            }
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
    }
}

class SwapsTest{
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        System.out.println("Przed zmianą: " + Arrays.toString(intArray));
        Swaps.Swap(intArray, 1,3);
        System.out.println("Po zmienie: "+ Arrays.toString(intArray));

        String[] stringArray = {"Adam", "Bartek", "Miłosz","Kamil"};
        System.out.println("Przed zmiana: " + Arrays.toString(stringArray));
        Swaps.Swap(stringArray,1,3);
        System.out.println("Po zmianie: "+ Arrays.toString(stringArray));

    }


}
