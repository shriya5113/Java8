package codeforces;

import java.util.*;


public class UltraFastCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 0; i< test;i++)
        {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int []arr = new int[n];
            for(int j= 0 ; j < n; j++)
            {
                arr[j]=scanner.nextInt();
            }

            Arrays.sort(arr);

            int b = n-1;
            int sum = arr[b];
//            Set<List<Integer>> uniquePairs = new HashSet<>();HashSet
                int count = 0 ;
            while(b>=0)
            {
                b--;

                if(sum >= x)
                {
                    count++;
                    if(b>-1) {
                        sum = arr[b];
                    }
                }
                else
                {
                    if(b>-1) {
                        sum += arr[b];
                    }
                }

            }
//            System.out.println(uniquePairs.size());
            System.out.println(count);
        }
    }
}