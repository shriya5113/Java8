package dsa;

//longest subarray  without Repeating characters (having unique char only)

import java.util.HashMap;

public class SlidingWindow2 {
    public static void main(String[] args) {

        String word = "abacbgccfdsaabg";
        char []chars = word.toCharArray();
        int maxi = 0 ;
        int i =0 ; int j =0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(j<chars.length)
        {
            while (map.containsKey(chars[j])) {
                map.remove(chars[i]);
                i++;
            }
            map.putIfAbsent(chars[j],1);

            maxi =Math.max(maxi,j-i+1);

            j++;


        }
        System.out.println(maxi);
    }

}
