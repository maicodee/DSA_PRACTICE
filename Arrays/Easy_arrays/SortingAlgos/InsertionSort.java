package SortingAlgos;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int j = 1; j < n; j++) {

            int temp = arr[j];

            int m = j - 1;

            while (m >= 0 && arr[m] > temp) {
                arr[m + 1] = arr[m];
                m--;
            }
            arr[m + 1] = temp;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

}
