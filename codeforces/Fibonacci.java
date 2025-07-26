package codeforces;

// Fibonacci series program in java

import java.io.*;

class GFG {
    // Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
int total =0;
        for (int i = 0; i < N; i++) {
            // Print the number
            total+=num1;

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(total);
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 100000;

        // Function Call
        Fibonacci(N);
    }
}
