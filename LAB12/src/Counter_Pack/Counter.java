package Counter_Pack;

public class Counter<T> {
    int count = 0;
    public void add(T element){
       count++;
    }

    public int getCount(){
        return count;
    }
}

class Test{
    public static void main(String[] args) {
        Counter list = new Counter();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.getCount());

    }
}