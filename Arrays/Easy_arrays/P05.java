// Write a program to sort the given array.
// Sample input : 5
//                4 5 1 2 9
// Sample O/p:  1 2 4 5 9

// Here, 6 is the size of array and then the elements are input by the user

// Here i have sorted using different sorting algorithms 1)Bubble 2)Insertion 3)Merge 4)Selection

// 1) Bubble Sort  : Time complexity: O(n^2) , Spcae: 
import java.util.Scanner;

public class P05 {

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