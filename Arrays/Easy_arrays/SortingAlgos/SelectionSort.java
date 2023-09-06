package SortingAlgos;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionsort(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int arr[] = new int[k];
        for (int i = 0; i < k; i++) {

            arr[i] = sc.nextInt();

        }

        int n = arr.length;
        sc.close();
        selectionsort(arr, n);

        for (int j = 0; j < k; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}