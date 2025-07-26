package codeforces;

import java.util.Arrays;
import java.util.Scanner;


public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
//        int[] arr =new int[n];n
        int num = 0;
        int max = -1;
        int min = 101;
        int aMax =0;
        int bMin =0;
        for(int i =0 ;i<num1;i++)
        {
            num=scanner.nextInt();
            if(num> max)
            {
               max=num;
               aMax=i;
            }
            if (num<=min)
            {
                min=num;
                bMin=i;
            }

        }

//        System.out.println(aMax + ": " + bMin);

   if(aMax>bMin)
  {
    bMin+=1;
   }

        if(bMin == num1-1)
        {
            bMin =0;
        }else
        {
            bMin = num1-1-bMin;
        }

        System.out.println(aMax+bMin);


    }
}
