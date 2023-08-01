// 3) Find the minimum and maximum element in an array.

// Sample input : 5
//                1 2 3 4 5
// Sample output :max =5
//                min = 1

// Here in sample input : 5 is the size of array

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
