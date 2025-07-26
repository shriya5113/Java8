package codeforces;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x =0 ;
        int y= 0;
        for(int i = 1 ; i<=5;i++)
        {
            for(int j =1;j<=5;j++)
            {
                int num = scanner.nextInt();
                if(num!=0)
                {
                    x = i-3;
                    y = j-3;
                }
            }
        }
       if(x<0)
       {
           x = -x;
       }
       if(y<0)
       {
           y=-y;
       }

        System.out.println(x+y);

    }
}
