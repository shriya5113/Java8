package dsa;


//we have given a array you to have print 1st negative number in the window of array
// window = 3and you have to print array of every window 1st negative number
// count of that array (arr.length - size of window + 1)

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeSubarray {
    public static void main(String[] args) {
        int[] nums = {12,-1,7,8,15,30,-16,28};
        int i = 0;
        int j = 0 ;
        int k = 3;
        int maxi = 0;
        List<Integer> list1 = new ArrayList<>();

        while(j< nums.length)
        {
            if(nums[j]<0) {
                list1.add(nums[j]);
            }
//            maxi = Math.max(nums[j],maxi); -another question resolving

            if(j-i+1 == k )
            {
                if(list1.isEmpty())
                {
                    System.out.print(" 0");
                }
                else
                {
                    System.out.print(" "+list1.get(0));
                    if(nums[i]== list1.get(0))
                    {
                        list1.remove(0);
                    }
                }
//                System.out.print(" " +maxi); -another question resolving
//                if(maxi == nums[i])-another question resolving
//                {
//                    maxi = nums[i+1];
//                }

               i++;
               j++;
            }
            else
            {
                j++;
            }

        }

    }
}
