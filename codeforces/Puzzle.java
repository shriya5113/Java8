package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         int m = scanner.nextInt();
         int[] arr= new int[m];

         for(int i = 0 ;i<m;i++)
         {
             arr[i]=scanner.nextInt();
         }
         int i =0;int j =0;
         int min = Integer.MAX_VALUE;

         Arrays.sort(arr);

        while(j< arr.length)
         {
             if(j-i+1 == n)
             {
                 if(arr[j]-arr[i]<min)
                 {
                     min = arr[j]-arr[i];
                 }
                 i++;
             }
             j++;
         }
        System.out.println(min);
    }
}
