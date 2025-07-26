package codeforces;

import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String str = scanner.next();
        char[] ch = str.toCharArray();


        for(int i=1;i<=t;i++)
        {
            for(int j=1;j<=str.length()-1;j++)
            {
                if(ch[j] =='G' && ch[j - 1] == 'B' )
                {
                    char temp = ch[j];
                    ch[j] = ch[j-1];
                    ch[j-1] = temp;
                    ++j;

                }

            }
        }

        for(char chara : ch)
        {
            System.out.print(chara);
        }
    }

}
