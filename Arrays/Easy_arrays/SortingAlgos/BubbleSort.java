// 1) Bubble Sort  : Time complexity: O(n^2) , Spcae: 

package SortingAlgos;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }

            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();

    }

}
