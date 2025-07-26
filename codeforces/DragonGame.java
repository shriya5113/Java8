package codeforces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DragonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        boolean flag = true;
        int [][]arr = new int[n][2];

        for(int i = 0 ; i<n ; i++) {
            for (int j=0; j<=1 ; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }


        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        for(int i = 0; i<n ; i++ )
        {
            int x = arr[i][0];
            int y = arr[i][1];

            if(s>x)
            {
                s+=y;
            }
            else
            {
                flag=false;
                break;
            }
        }

        if(flag)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }
}
