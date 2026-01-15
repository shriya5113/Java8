package dsa;

public class BinarySearch {

    //used in only sorting order
    //logn is time complexity while in linear search : n
    public void Search(int arr[], int start , int end , int key)
    {

        while(start<end)
        {
            int mid = (start+(end-start))/2;

            if(arr[mid] == key)
            {
                System.out.printf("found");
                break;
            } else if (arr[mid]>key) {
                end--;
            }else
            {
                start++;
            }
        }
    }
}
