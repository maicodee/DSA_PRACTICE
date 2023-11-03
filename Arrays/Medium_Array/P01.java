// 1. Find the Union and Intersection of the two sorted arrays
// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5
// Explanation: 
// 1, 2, 3, 4 and 5 are the
// elements which comes in the union set
// of both arrays. So count is 5.

package Arrays.Medium_Array;

import java.util.*;
import java.util.HashSet;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int arr1[] = new int[a1];

        for (int i = 0; i < a1; i++) {
            arr1[i] = sc.nextInt();
        }

        int a2 = sc.nextInt();
        int arr2[] = new int[a2];

        for (int i = 0; i < a2; i++) {
            arr2[i] = sc.nextInt();
        }

        int count = Union(arr1, arr2, a1, a2);
        System.out.println(count);
    }

    // int left = 0, right = 0;
    // List<Integer> res = new ArrayList<>();

    // while (left < arr1.length && right < arr2.length) {

    // while (left > 0 && left > arr1.length && arr1[left] == arr1[left - 1]) {
    // left++;
    // }
    // while (right > 0 && right > arr1.length && arr1[right] == arr1[right - 1]) {
    // right++;
    // }

    // if (left >= arr1.length) {
    // res.add(arr2[right]);
    // right++;
    // continue;

    // }

    // if (right >= arr1.length) {
    // res.add(arr2[left]);
    // left++;
    // continue;

    // }

    // // comparison

    // if (arr1[left] < arr2[right]) {
    // res.add(arr1[left]);
    // left++;

    // } else if (arr1[left] > arr2[right]) {
    // res.add(arr1[right]);
    // right++;

    // } else {
    // res.add(arr1[left]);
    // left++;
    // right++;
    // }

    // }

    // System.out.println(res);

    // sc.close();

    // }

    // Finding union using Hashset
    public static int Union(int[] a1, int[] a2, int m, int n) {

        HashSet<Integer> res = new HashSet<>();

        for (int i = 0; i < m; i++) {
            res.add(a1[i]);
        }
        for (int i = 0; i < n; i++) {
            res.add(a2[i]);
        }

        return res.size();
    }
}

// Intersection

// package Arrays.Medium_Array;

// import java.util.*;

// public class P01 {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// int a1 = sc.nextInt();
// int arr1[] = new int[a1];

// for (int i = 0; i < a1; i++) {
// arr1[i] = sc.nextInt();
// }

// int a2 = sc.nextInt();
// int arr2[] = new int[a2];

// for (int i = 0; i < a2; i++) {
// arr2[i] = sc.nextInt();
// }
// sc.close();

// int left = 0, right = 0;
// List<Integer> res = new ArrayList<>();

// while (left < arr1.length && right < arr2.length) {
// left++;

// while (left > 0 && left < arr1.length && arr1[left] == arr1[left - 1]) {
// left++;

// }

// while (right > 0 && right < arr2.length && arr2[right] == arr2[right - 1]) {
// right++;

// }

// // if any one array finished
// if (left >= arr1.length || right > arr2.length) {
// break;
// }

// // comparision
// if (arr1[left] < arr2[right]) {
// left++;
// } else if (arr1[left] > arr2[right]) {
// right++;
// } else {
// res.add(arr1[left]);
// left++;
// right++;
// }

// }

// System.out.println(res);

// }
// }