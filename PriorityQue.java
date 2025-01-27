import java.util.PriorityQueue;

public class PriorityQue {

    public static int kthSmallest(int[] arr, int N, int K) {

        PriorityQueue<Integer> priorityQue = new PriorityQueue<>( (a, b) -> b- a);

        for(int i = 0 ; i < N ; i++)
        {
            priorityQue.offer(arr[i]);
            if(priorityQue.size()>K)
            {
                System.out.println(priorityQue.poll());
            }
            System.out.println(priorityQue + "__"+i+"___");

        }
        return priorityQue.peek();
    }


    public static void main(String[] args) {
        int N = 10;
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int K = 4;

        // Function call
        System.out.println("Kth Smallest Element is: " + kthSmallest(arr, N, K));
    }
}