package codeforces;


import java.util.HashMap;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] arr = word.toCharArray();
        int k = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char a : arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(int n : map.values())
        {
            if(n%2 !=0)
            {
                k+=n;
            }
        }


        if(k == 0 || k % 2 != 0)
        {
            System.out.println("First");
        }else
        {
            System.out.println("Second");
        }
    }

}


/*
aabb
abba
        abc
        bc
        c

        abccc  a=1 , b= 1,c=3 k=6
        bccc
        ccc

k == 0 → First.

k == 1 → First.

k > 1 odd → First.

k > 1 even → Second.

 */