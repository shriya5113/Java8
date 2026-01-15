package codeforces;

import java.util.*;


public class PashmakandFlowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long max =0 ;
        long min =  Integer.MAX_VALUE;
        long countMAx=0; long countMin=0;
            for (int j = 0; j < n; j++) {
               long a = scanner.nextInt();
               if(a<min)
               {
                   min=a;
                  countMin =1;
               } else if (a==min) {
                   countMin++;
               }

                if(a>max)
                {
                    max=a;
                    countMAx =1;
                } else if (a==max) {
                    countMAx++;
                }

            }

            long result1 = max-min;
            long result2 =0;

             if(result1!=0)
             {
                 result2=  countMin *countMAx;
             }
             else
                 result2= n*(n-1)/2;

        System.out.println(result1 + " " + result2);

    }
}

