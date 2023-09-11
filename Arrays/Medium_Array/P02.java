// Write a program to cyclically rotate an array by one
// Input:
// N = 5
// A[] = {1, 2, 3, 4, 5}
// Output:
// 5 1 2 3 4

package Arrays.Medium_Array;

public class P02 {

    
int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
