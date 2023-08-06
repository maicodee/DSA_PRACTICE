// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm.

// Here, 9 is the size of array input by the user followed by the elements input

// i/p : 9
//              0 0 1 1 1 0 2 2 1

// o/p : 0 0 0 1 1 1 1 2 2 

import java.util.Scanner;

class P08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int low = 0;
        int mid = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}
