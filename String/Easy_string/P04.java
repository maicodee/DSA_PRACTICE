// Find Duplicate characters in a string.
//Approach : 1. converted array to char array and then use bubbled sort to find duplicates

package String.Easy_string;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        char arr[] = new char[n];
        arr = str.toCharArray();
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicate character  " + arr[i]);
                }
            }
        }
    }
}
