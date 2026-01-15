package dsa;

public class SelectionSort {
    public int[] sort(int []arr)
    {
       for(int i  = 0 ; i<arr.length;i++)
       {
           int minIdx = i;

           for(int k = i+1 ; k<arr.length ; k++ )
           {
               if(arr[k]<arr[minIdx])
               {
                 // Swap(arr[k],arr[minIdx]);
                 minIdx=k;
               }
           }
       }
       return arr;
    }
}
//sorted part and unsorted part
//find the min in the unsorted part and swap it with i
//n^2 sorting