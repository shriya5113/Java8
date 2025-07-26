package javaeigth;

import java.util.*;
import java.util.stream.Collectors;

public class Dsa1 {
     public static int findLargestSumPair(int[] arr, int n)
     {


         ArrayList<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

//         It’s a shorthand for lambda expressions where you simply call a method, and it improves readability.
//         In your case (ArrayList::new), it’s used to reference the constructor of ArrayList and create new instances directly.





         for (Integer element : arrayList) {
             System.out.println(element);
         }


//         Collections.sort(arrayList);
//         int sum = arr[n-1]+arr[n-2];
//         return  sum;


         return 0;
     }

    public static void main(String[] args) {
        int[] arr = {12, 84, 10, 6, 40};
        int n = arr.length;
        System.out.println("Max Pair Sum is " + findLargestSumPair(arr, n));
    }
}
