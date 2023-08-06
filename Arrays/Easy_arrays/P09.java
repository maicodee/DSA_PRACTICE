// Find the range of the array. Range means the difference between the maximum and minimum element in the array.
// here , 6 is the size of array followed by the input of elements

// i/p: 6
//      -1 -3 3 47 21 91
// o/p: Range 94
// 91-(-3) = 94

import java.util.Scanner;

public class P09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        sc.close();

        int min = arr[1];
        int max = arr[1];

        for (int i = 1; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int Range = max - min;
        System.out.println("Range " + Range);

    }
}

/*
 * Approach
 * 
 * Brute: 1) We can use Arrays.sort and return difference in first and last
 * element
 * 2) We can sort the array by sorting algo and return diff
 * 3) Find the max and minimum element by comparision and return diff
 * 
 * Optimal:
 * 
 * More optimal:
 * 
 */