package dsa;

import java.util.HashMap;

public class ToySlidingWindow {
    public static void main(String[] args) {
        String str = "aabbbbaaaabccbbbbbabbb";
        char []chars = str.toCharArray();
        int i =0,j=0,maxi=0;
        HashMap<Character,Integer> map = new HashMap<>();
//        System.out.println(chars[6]);
        while(j< chars.length)
        {
            map.put(chars[j], map.getOrDefault(chars[j],0)+1);
//            System.out.println(map.size());
            while(map.size()>2)
            {
                if(map.get(chars[i])>1) {
                    map.put(chars[i], map.get(chars[j]) - 1);
                }
                else {
                    map.remove(chars[i]);
                }
                System.out.println(map + " size : " + map.size());

                i++;
            }
            maxi = Math.max(maxi,j-i+1);
            j++;
        }
        System.out.println(map);

        System.out.println(maxi);
    }
}
