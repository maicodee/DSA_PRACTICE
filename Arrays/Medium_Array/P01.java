// 1. Find the Union and Intersection of the two sorted arrays
// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5
// Explanation: 
// 1, 2, 3, 4 and 5 are the
// elements which comes in the union set
// of both arrays. So count is 5.

package Arrays.Medium_Array;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int arr1[] = new int[a1];

        for (int i = 0; i < a1; i++) {
            arr1[i] = sc.nextInt();
        }

        int a2 = sc.nextInt();
        int arr2[] = new int[a2];

        for (int i = 0; i < a2; i++) {
            arr2[i] = sc.nextInt();
        }
        int count = arr1.length;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

            }
        }

        sc.close();

    }
}