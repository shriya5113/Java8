package leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumWindowSubstring {

    static String minWindow(String s, String t) {

        int i = 0 ;
        int j = 0;
        int min = Integer.MAX_VALUE;
        String result ;
        char []chars = s.toCharArray();
        char []find = t.toCharArray();
        HashMap<Character, List<Integer>> map = new HashMap<>();

        while(j<chars.length)
        {
            map.computeIfAbsent(chars[j],k->new ArrayList<>()).add(j+1);
            boolean flag = true;

            for (char c : find) {
                if (!map.containsKey(c)) {
                    flag =false;
                    break;
                }
            }
//ABECODEBANC
            if(flag)
            {
                min = Math.min(min, j - i + 1);
//                map.
//                i++;
            }
                j++;
        }

        System.out.println(map +" " + min);




//1,11,4,10,6,13   --   4,11,10,6,13
//1,4,6 - 1 to 6
//1,14 - Maximum
//

        return null;
    }

    public static void main(String[] args) {
        //ADOBECODEBANC
     String s  = "ADOBECODEBANC";
     String t = "ABC";
        System.out.println(minWindow(s,t));

    }
}
