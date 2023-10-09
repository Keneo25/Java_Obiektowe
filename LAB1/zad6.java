import java.util.Scanner;

public class zad6 {
    public static void main(String arg[]){
        System.out.print("Podaj liczbe a: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Podaj liczbe b: ");
        int b = input.nextInt();

        System.out.print("Podaj liczbe c: ");
        int c = input.nextInt();

        System.out.print("Podaj liczbe d: ");
        int d = input.nextInt();

        a += 4;
        b -= a;
        c *= (2-4*a);
        d /=(4-Math.pow(a,2));

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

        System.out.println(d);


    }
}
