// Write a program to check whether given two strings are anagram or not.

package String.Easy_string;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();

    
        solution.anagram(str1, str2, n1, n2);

        sc.close();
    }
}

class solution {
    public static int anagram(String str1, String str2, int n1, int n2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        if (n1 != n2) {
            return -1;
        }
        

    }
}