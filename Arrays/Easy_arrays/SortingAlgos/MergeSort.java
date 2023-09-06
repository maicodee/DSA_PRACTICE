package SortingAlgos;

import java.util.Scanner;

public class MergeSort {

    public static void conqure(int arr[], int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {

            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {

            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];

        }

    }

    public static void divide(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // int mid = si + (ei -si) / 2 : in this method time complexity is less or int
        // mid = (si + ei) / 2 : in this case sometimes timecomplexity is more
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conqure(arr, si, mid, ei);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        sc.close();
        int si = 0, ei = n - 1;
        divide(arr, si, ei);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}