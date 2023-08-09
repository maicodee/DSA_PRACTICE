//7) Given an number n. Find the number of occurrences of n in the array.

//  i/p : 3
//    6
//    1 3 3 3 6 7
// o/p: 3

import java.util.Scanner;

class P07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int length = sc.nextInt();

        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        for (int j = 0; j < length; j++) {
            if (arr[j] == key) {
                count++;
            }

        }
        System.out.println(+count);

    }
}

/*
 * Approach
 * 
 * Brute: Compared element with the key and returned count
 * 
 * Optimal:
 * 
 * More optimal:
 * 
 */