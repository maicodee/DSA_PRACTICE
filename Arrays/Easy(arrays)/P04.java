// Write a program to reverse the array.

// [Hint: use indexes]

// Input : 5
//         1 2 3 4 5
// O/p : 5 4 3 2 1

// Here , 5 is the size of array and then elements of arrays are input

import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        sc.close();

        for (int j = n - 1; j >= 0; j--) {

            System.out.print(arr[j] + " ");

        }

    }

}
