// Write a program to check whether given two strings are anagram or not.

package String.Easy_string;

import java.util.Arrays;
import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        solution.anagram(str1, str2);
        int result = solution.anagram(str1, str2);

        if (result == 1) {
            System.out.println("The strings are anagrams.");
        } else if (result == -1) {
            System.out.println("The strings are not anagrams.");
        }
        sc.close();
    }
}

class solution {
    // public static int anagram(String str1, String str2, int n1, int n2) {
    public static int anagram(String str1, String str2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        int n1 = arr1.length;
        int n2 = arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (n1 != n2) {
            return -1;

        } else {
            for (int i = 0; i < n1; i++) {

                if (arr1[i] != arr2[i]) {
                    return -1;
                }

            }

            return 1;
        }

    }
}