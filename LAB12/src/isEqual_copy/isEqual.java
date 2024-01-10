package isEqual_copy;

public class isEqual {
    public static <T> boolean isEqual(T o1, T o2){
        if (o1 == o2){
            return true;
        }
        else {
            return false;
        }
    }
}
class Test{
    public static void main(String[] args) {
       int liczba1 = 1;
       int liczba2 = 1;

        System.out.println(isEqual.isEqual(liczba1, liczba2));
    }
}
