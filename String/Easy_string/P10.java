// Check whether the String is a palindrome or not.

package String.Easy_string;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str = str1;
        char arr[] = str.toCharArray();
        int n = arr.length;
        for (int i = str.length() - 1; i >= 0; i--) {

            char temp = arr[0];
            arr[0] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;

        }

        if (str1.equals(String.valueOf(arr))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

// public static boolean isPalindrome(String str) {
// int left = 0;
// int right = str.length() - 1;

// while (left < right) {
// if (str.charAt(left) != str.charAt(right)) {
// return false;
// }
// left++;
// right--;
// }

// return true;
// }