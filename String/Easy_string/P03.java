// Write a program to remove all whitespaces in a given string.

//Approach
// 1. Using replace function
// 2. declare a new string and then simply add every character one by one ignoring the whiteSpace
package String.Easy_string;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // str = str.replaceAll("\\s" , "");
        // System.out.println(str);
        // sc.close();

        String newString = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                newString += ch;
            }
        }
        System.out.println(newString);

        sc.close();
    }
}