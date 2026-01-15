package dsa;

public class QuickSort {

    public void sort(int[] arr, int low , int high) {

        if(low<high)
        {
            int mid = partition(arr,low,high);
            sort(arr,low,mid-1);
            sort(arr,mid+1,high);

        }
    }

    private int partition(int[] arr, int low, int high) {
//0,1,2,3,4
        int pivot= arr[high];

        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }
}


//parton Algo
//pivot n^2
