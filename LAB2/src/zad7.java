public class zad7 {
    public static void main(String arg[]){
        int a = 17;
        int b = 13;
        int c = 14;
        if(a > b && b > c) {
            System.out.println(a + " " + b + " " + c);
        }
        if(a > c && c > b) {
            System.out.println(a + " " + c + " " + b);
        }
        else if (b > a && a > c) {
            System.out.println(b + " " + a + " " + c);
        }
          else if(b > c && c > a){
            System.out.println(b + " " + c + " " + a);
            }
         else if (c  > b && b > a) {
            System.out.println(c + " " + b + " " + a);
        }
        else if (c  > a && a > b) {
            System.out.println(c + " " + a + " " + b);
        }
    }
}

