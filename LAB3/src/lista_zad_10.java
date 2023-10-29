import java.util.ArrayList;
import java.util.List;

public class lista_zad_10 {

        public static List<Integer> copyArray(List<Integer> original) {
            List<Integer> copiedArray = new ArrayList<>(original.size());

            for (Integer value : original) {
                copiedArray.add(value);
            }

            return copiedArray;
        }

        public static void main(String[] args) {

            List<Integer> original = List.of(1, 2, 3, 4, 5);
            List<Integer> copied = copyArray(original);

            System.out.println("Oryginalna lista: " + original);
            System.out.println("Skopiowana lista: " + copied);
        }



    }

