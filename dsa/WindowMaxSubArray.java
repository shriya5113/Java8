package dsa;

//find target : max subarray  whose have window size 3
public class WindowMaxSubArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,8,2,9,1};
        int i = 0;
        int j = 0 ;
        int maxi = 0 ;
        int sum = 0;
        int k = 3;
        int SIdx = 0;
        int EIdx = 0;
        while(j< nums.length)
        {
            sum+=nums[j];
            if(j-i+1==k)
            {
                maxi = Math.max(sum,maxi);
                sum-=nums[i];
                 SIdx = i ;
                 EIdx = j;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }

        System.out.println(maxi + " Starting index : "+ SIdx + " Ending Index : " + EIdx);
    }
}
