package dsa;

public class BubbleSorting {
      //n^2 time complexity
    public int[] sort(int []arr)
    {
        for(int k = arr.length-1 ;k>1;k--)
        {
            for(int i =1 ; i<=k ;i++) {
                if (arr[i - 1] > arr[i]) {
                    // swap(arr[i-1],arr[i]);
                }
            }
        }
        return arr;
    }


}

//swap 2 elements accordingly