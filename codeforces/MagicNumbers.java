package codeforces;

import java.util.*;
public class MagicNumbers {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String str = scanner.next();
         String regex = "WUB";

         String[] arr = str.split(regex);

         for(int i = 0 ; i<arr.length;i++)
         {
             System.out.print(arr[i]);
             if(i!=arr.length-1 && !arr[i].isEmpty())
                 System.out.print(" ");
         }
    }
}
// 0 1
