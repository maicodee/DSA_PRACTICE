// Write a program to reverse the string in place.

package String.Easy_string;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        char arr[] = new char[n];
        arr = str.toCharArray();

        for(int i = 0; i<n/2 ;i++){
            char temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;


          // other approach  
            // String nstr = "";
            // char ch;
            // ch= str.charAt(i); //extracts each character
            // nstr= ch+nstr; //adds each character in front of the existing stri

        }
        System.out.println(String.valueOf(arr));
        sc.close();
    }
}