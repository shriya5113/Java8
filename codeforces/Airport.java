package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Airport {
    // Function to calculate factorial
    public static long factorial(int n, int p ){
        long fact = 0;
        for (int i = n; i >0; i--) {
            if(p>0) {
                fact += i;
                p--;
            }
        }
        return fact;
    }

    // Function to calculate sum of factorials from a[i] to a[0]
    public static long sumOfFactorials(int[] a, int i,int n) {
        long sum = 0;
        for (int j = 0; j <= i; j++) {
            if(n>0) {
                sum += factorial(a[j], n);
                n -= a[j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int min = 0;
        long value = 0;
        for (int i = 0; i < arr.length; i++) {

            min += arr[i];
            if (min >= n) {
                value = sumOfFactorials(arr, i,n);
                break;
            }

        }

        int max =0;
        int j = arr.length-1;
        while(j>=0 && n!=0)
        {
            if(j == 0) {
                j = arr.length-1;
                if(j==0)
                {
                    max+=arr[j];
                    arr[j]--;
                }
            }else {
                if (arr[j - 1] <= arr[j] && arr[j] > 0) {
                    max += arr[j];
                    arr[j]--;
                } else if (arr[j - 1] > 0) {
                    max += arr[j - 1];
                    arr[j - 1]--;
                    j--;
                }
            }
            n--;

        }

        System.out.print(max+" ");
        System.out.print(value);
    }
}
