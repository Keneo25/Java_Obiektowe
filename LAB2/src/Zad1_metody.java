public class Zad1_metody {
    public static void main(String arg[]){
        int n = 4;
        int parz = 0;
        int nparz = 0;
        int  suma= 0;

        for(int i = 0; i<= n; i++){
            if(i % 2 == 0){

                parz += i;
            }
            if(i % 2 !=0){

                nparz += i;
            }
        }
        suma = nparz - parz;
        System.out.println(suma);
    }
}
