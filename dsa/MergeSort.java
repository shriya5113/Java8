package dsa;

public class MergeSort {

    public void merge(int []a,int l , int m , int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        int i =0 ; int j =0;
        int k = l;

        while(i < n1 && j <n2)
        {
            if(L[i]<=R[j])
            {
                a[k]=L[i];
                i++;
            }else
            {
                a[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
         a[k]=L[i];
         i++;
         k++;
        }

        while(j<n2)
        {
            a[k]=R[j];
            j++;
            k++;
        }
    }
    public void sort(int[] arr, int l, int r){

        if(l<r) {
            int mid = l+r/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}


//divide and conquer Rule
//nlogn