public class zad4 {
    public static void main(String arg[]){
        int a = 1;
        int b =2;
        int c = -3;
        System.out.println("Obliczamy rownanie kwadratowe: ax^2 + bx + c");
        int delta = (int) (Math.pow(b,2) - 4 * a* c);
        System.out.println("Delta: "+delta);
        if(delta > 0){
            int x1 = (int) (((b*-1)+ Math.sqrt(delta))/2*a);
            int x2 = (int) (((b*-1)- Math.sqrt(delta))/2*a);
            System.out.println(x1);
            System.out.println(x2);
        }
        else if(delta == 0){
            int x1 = (int) (((b*-1)+ Math.sqrt(delta))/2*a);
            System.out.println(x1);
        }
        else if(delta < 0){
            System.out.println("Nie ma");
        }

    }
}
