// Find the Kth largest and Kth smallest number in an array.

// Here , K = 3 , 6 is the size of array :
// i/p :3 
//      6
//      2 3 4 1 9 8
// o/p : min: 3
//       max: 4

import java.util.Scanner;
//import java.util.Arrays;

public class P06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();
        int length = sc.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {

            arr[i] = sc.nextInt();
        }

        // we can use any sorting algorithm to sort the array first and then return the
        // first and last third index

        // or we can also use Arrays.sort by importing java.util.Arrays and return
        // indexes

        // Arrays.sort(arr);

        for (int j = 0; j < length; j++) {
            for (int k = j + 1; k < length; k++) {
                if (arr[k] < arr[j]) {

                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println(arr[key - 1]);
        System.out.println(arr[length - key]);

        sc.close();

    }
}

/*
 * Approach
 * 
 * Brute: just sort the array and return indexes
 * 
 * Optimal:
 * 
 * More optimal:
 * 
 */