package dsa;

//anagrams : you have word i.e for -> you have to count how many times it repeated
// even it is in jumbled formed : orf , rfo - > considered these also
// firstly find length of target given


import java.util.HashMap;

public class AnagramsSubString {
    public static void main(String[] args) {

        String str = "foxrxxorforffforxorfoiodfg";
        char []arr = str.toCharArray();
        String target = "for";
        char []chars = target.toCharArray();
        int k = target.length();
        int i =0 ;
        int j =0 ;
        int count =0 ;
        boolean flag =false;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        while(j<arr.length)
        {
            hashMap.put(arr[j],hashMap.getOrDefault(arr[j],0)+1);

            if(j-i+1 == k )
            {
                for (char aChar : chars) {
                    if (hashMap.containsKey(aChar) && hashMap.get(aChar) > 0) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) - 1);
                if(flag)
               {
                   count++;
               }
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        System.out.println(count);

    }
}
