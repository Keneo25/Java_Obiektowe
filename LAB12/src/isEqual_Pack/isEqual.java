package isEqual_Pack;

public class isEqual {
    public static <T> boolean isEquals(T object1, T object2){
        if(object1 == object2){
            return true;
        }
        else {
            return false;
        }
    }
}
class isEqualsTest{
    public static void main(String[] args) {
        String str1 = "Adam";
        String str2 = "Adam";
        System.out.println("Czy stringi są równe? " + isEqual.isEquals(str1, str2));

        int liczba1 = 45;
        int liczba2 = 45;
        System.out.println("Czy liczby sa takie same? "  +isEqual.isEquals(liczba1,liczba2));

    }
}
