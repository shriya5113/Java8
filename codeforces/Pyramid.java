package codeforces;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();// Adjust for a larger/smaller pattern

                // Upper half including middle row
                for (int i = 0; i <= n; i++) {
                    printRow(i, n);
                }

                // Lower half (excluding middle row to avoid repetition)
                for (int i = n - 1; i >= 0; i--) {
                    printRow(i, n);
                }
            }

            private static void printRow(int i, int n) {
                // Print leading spaces
                for (int j = 0; j < (n - i) * 2; j++) {
                    System.out.print(" ");
                }

                // Print increasing sequence
                for (int j = 0; j <= i; j++) {
                    System.out.print(j);
                    if(i!=0)
                        System.out.print(" ");
                }

                // Print decreasing sequence
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(j);
                    if(j!=0)
                    {
                        System.out.print(" ");
                    }
                }

                // Move to the next line
                System.out.println();
            }
        }


