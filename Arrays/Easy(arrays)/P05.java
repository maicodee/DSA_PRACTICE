// Write a program to sort the given array.
// Sample input : 5
//                4 5 1 2 9
// Sample O/p:  1 2 4 5 9

// Here, 6 is the size of array and then the elements are input by the user

// Here i have sorted using different sorting algorithms 1)Bubble 2)Insertion 3)Merge 4)Selection

// 1) Bubble Sort  : Time complexity: O(n^2) , Spcae: 
import java.util.Scanner;

// public class P5 {

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {

//             arr[i] = sc.nextInt();
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[i]) {

//                     int temp = arr[j];
//                     arr[j] = arr[i];
//                     arr[i] = temp;

//                 }

//             }
//         }

//         for (int k = 0; k < n; k++) {
//             System.out.print(arr[k] + " ");
//         }

//         sc.close();

//     }

// }

// 2) Insertion Sort

// public class P5 {

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {

//             arr[i] = sc.nextInt();
//         }
//         sc.close();

//         for (int j = 1; j < n; j++) {

//             int temp = arr[j];

//             int m = j - 1;

//             while (m >= 0 && arr[m] > temp) {
//                 arr[m + 1] = arr[m];
//                 m--;
//             }
//             arr[m + 1] = temp;
//         }
//         for (int k = 0; k < n; k++) {
//             System.out.print(arr[k] + " ");
//         }
//     }

// }

// // 3) Merge Sort

public class P05 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        sc.close();

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        sc.close();
        int l = arr[0], h = arr[n - 1];
        Mergesort(arr, l, h);
    }

    public static void Mergesort(int arr[], int l, int h) {

        int mid = (l + h) / 2;
        Mergesort(arr, l, mid);
        Mergesort(arr, mid + 1, h);
        Merge(arr, l, mid, h);

    }

    public static void Merge(int arr[],int l,int mid ,int l){

        }

    for(

    int k = 0;k<n;k++)
    {

        System.out.println(arr[k]);
    }

}

// 4) Selection Sort

// import java.util.Scanner;
// public class P5 {

// public static void main(String args[]){

// Scanner sc = new Scanner(System.in);

// }

// }