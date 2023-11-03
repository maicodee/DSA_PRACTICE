package Arrays.Medium_Array;

import java.util.*;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lenth of first array");
        int a1 = sc.nextInt();
        System.out.println("Enter elements of first array");
        int arr1[] = new int[a1];

        for (int i = 0; i < a1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Enter lenth of second array");
        int a2 = sc.nextInt();
        System.out.println("Enter elements of second array");
        int arr2[] = new int[a2];

        for (int i = 0; i < a2; i++) {
            arr2[i] = sc.nextInt();
        }

        int count = Union(arr1, arr2, a1, a2);
        System.out.println();
        System.out.println("Size of union array is "+count);
    }

    private static int Union(int[] a1, int[] a2, int m, int n) {

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
