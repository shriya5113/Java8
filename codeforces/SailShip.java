package codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SailShip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int S1 = scanner.nextInt();
        int S2 = scanner.nextInt();
        int T1 = scanner.nextInt();
        int T2 = scanner.nextInt();
        String word = scanner.next();
        HashMap<Character, List<Integer>> map = new HashMap<>();
        int result = -1;
        int a = 0;

        for (int i = 0; i < t; i++) {
            map.computeIfAbsent(word.charAt(i), k -> new ArrayList<>()).add(i + 1);
        }

        System.out.println(map);
        if (S1 < T1 && map.get('E').size() >= T1 - S1) {
             a = T1 - S1;
            result = Math.max(result, map.get('E').get(a - 1));
            map.get('E').subList(0, a).clear();
            System.out.println(map);
        }
        else if (S1 < T1 && map.get('W').size() >= S1-T1) {
            a = S1 - T1;
            result = Math.max(result, map.get('W').get(a - 1));
            map.get('W').subList(0, a).clear();
            System.out.println(map);
        }
        else if (S1 == T2)
        {
            if(map.containsKey('W')  )
            {
                map.get('W').subList(0, 1).clear();
                a = Math.max(result,map.get('W').get(0));
            }
            if (map.containsKey('E')) {
                map.get('E').subList(0, 1).clear();
                 a = Math.max(result,map.get('E').get(0));
            }

        }


        System.out.println( " ::::::: Y turns :::::: ");


        if (S2 < T2 && map.get('N').size() >= T2 - S2 && result != -1) {
             a = T2 - S2;
            result = Math.max(result, map.get('N').get(a - 1));
            map.get('N').subList(0, a).clear();
            System.out.println(map);

        }
        else if (S2 < T2 && map.get('S').size() >= S2-T2 && result != -1) {
             a = S2 - T2;
            result = Math.max(result, map.get('S').get(a - 1));
            map.get('S').subList(0, a).clear();
            System.out.println(map);
        }


        System.out.println(result);
    }
}
//19 -172106364 -468680119 -172106365 -468680119
//        SSEEESSSESESWSEESSS