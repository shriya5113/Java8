package codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        char[] arr = name.toCharArray();
        HashMap<Character,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                ArrayList<Integer> list1 = map.get(arr[i]);
                list1.add(i);
                map.replace(arr[i],list1);
            }else {
                ArrayList<Integer> list2 = new ArrayList<>();
                list2.add(i);
                map.put(arr[i],list2);
            }
        }

        char[] result = "hello".toCharArray();
        int k =0;
        boolean flag = true;
        int prev_index = -1;
        while(k < result.length && flag)
        {
           if(map.containsKey(result[k])) {
               for (int i = 0; i < map.get(result[k]).size(); i++) {
                   int value = map.get(result[k]).get(i);
                   if (prev_index < value) {
                       prev_index = value;
                       ArrayList<Integer> list = map.get(result[k]);
                       if(list.size() == 1)
                       {
                           map.remove(result[k]);
                       }
                       else {
                           list.remove(i);
                           map.put(result[k],list);
                       }
                       break;
                   } else if (i == map.get(result[k]).size()-1) {
                       flag = false;
                       break;
                   }
               }

               k++;
           }
           else {
            flag = false;
               break;
           }
        }

        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
