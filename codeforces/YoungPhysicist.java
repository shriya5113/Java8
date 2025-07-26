package codeforces;

import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int resultx =0;
        int resulty =0;
        int resultz=0;
        for(int i =0 ;i<n;i++)
        {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            resultx+=x;
            resulty+=y;
            resultz+=z;
        }

        if(resultx ==0 && resulty ==0 && resultz ==0)
        System.out.printf("YES");
        else
            System.out.printf("NO");

    }

}

