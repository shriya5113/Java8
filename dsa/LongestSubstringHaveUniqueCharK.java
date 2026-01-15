package dsa;

import java.util.HashMap;

public class LongestSubstringHaveUniqueCharK {
    public static void main(String[] args) {
        String word = "aabacdededabc";
        char []chars = word.toCharArray();
        int t = 3 ; //have 3 unique char
        int max = 0 ;
        int i =0 ; int j =0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(j<chars.length)
        {
           map.put(chars[j],map.getOrDefault(chars[j],0)+1);

           if(map.size() == t)
           {
               max=Math.max(max,j-i+1);
           }

           while(map.size()>t)
           {
               if(map.containsKey(chars[i]))
               {
                   if(map.get(chars[i])>1)
                   map.put(chars[i],map.get(chars[i])-1);
                   else
                       map.remove(chars[i]);
               }
               i++;
           }

           j++;
        }
        System.out.println(max);
    }
}
