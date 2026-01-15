package dsa;

public class LongestSubarrayofSumK {
    public static void main(String[] args) {
        int[] nums = {4,1,2,3,1,1,0,2,7,5};
        int i =0 ;
        int j =0 ;
        int max =0 ;
        int sum=0;
        int t =5;
        while(j<nums.length)
        {
            sum+=nums[j];

            while(sum>t)
            {
                sum-=nums[i];
                i++;
            }
            if(sum == t)
            {
                max = Math.max(max,j-i+1);
            }
            j++;
        }
        System.out.println(max);
    }
}
