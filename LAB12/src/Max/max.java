package Max;

import java.util.ArrayList;
import java.util.Arrays;

public class max{
  public static <T extends Comparable<T>> T max(T[] arr){
      if(arr == null || arr.length == 0){
          return null;
      }
      T maxEle = arr[0];
      for (int i = 0;i<arr.length;i++){
          if (arr[i].compareTo(maxEle) > 0){
              maxEle = arr[i];
          }
      }
      return maxEle;
    }
}
class Test{
    public static void main(String[] args) {
        Integer[] liczba = {1,2,8,5,6};
        System.out.println(max.max(liczba));

    }
}
