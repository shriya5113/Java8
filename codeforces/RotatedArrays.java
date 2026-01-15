package codeforces;

public class RotatedArrays {

    //find arr with no of rotations

    private int[] rotationNumber(int []arr, int k )
    {
        int []tmp = new int[arr.length];
        int p = 0 ;

        if(k > 0 && k <= arr.length ) {
            for (int i = arr.length - k-1; i < arr.length - 1; i++) {
                tmp[p] = arr[i];
                p++;
            }

            for (int i = 0; i < arr.length - 1 - k; i++) {
                tmp[p] = arr[i];
                p++;
            }
        }
        return tmp;
    }

}
