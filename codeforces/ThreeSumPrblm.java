package codeforces;

public class ThreeSumPrblm {

    private void twoSum(int []arr , int l , int r , int t)
    {
        while(l<r)
        {
            if(arr[l]+arr[r] == t)
            {
                System.out.printf("found");
            } else if (arr[l]+arr[r] < t) {
                l++;
            }else
                r--;

        }

    }


    public void sumProblem(int[] arr , int t)
    {
        for(int i = 0 ; i< arr.length-3 ; i++)
        {
            t = t - arr[i];
            twoSum(arr,i+1, arr.length-1, t);
        }
    }

}
