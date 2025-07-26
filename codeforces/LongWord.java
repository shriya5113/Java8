package codeforces;

import java.util.*;

public class LongWord {

    public static boolean countSuperCentral(int[][] arr, int x, int y, int n) {
        int right = 0;
        int left = 0;
        int upper = 0;
        int lower = 0;
        for (int j = 0; j < n; j++) {
            int x1 = arr[j][0];
            int y1 = arr[j][1];

            if (y == y1 && (right == 0 || left == 0)) {
                if (x > x1)
                    left++;
                if (x < x1)
                    right++;
            }
            if (x == x1 && (upper == 0 || lower == 0)) {
                if (y1 > y)
                    upper++;
                if (y1 < y)
                    lower++;
            }
            if (right != 0 && left != 0 && upper != 0 && lower != 0) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        int count=0;

        for (int i = 0; i < n; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            if(countSuperCentral(arr,x,y,n))
                count++;
        }
        System.out.println(count);
    }
}




