// Write a program to reverse each word in the given string.

package String.Easy_string;

import java.util.Scanner;
// import java.util.Arrays;

public class P09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(str1);
        sc.close();
        char[] arr1 = str1.toCharArray();
        int n = arr1.length;

        // This below code will reverse each chacter of the line 
        for (int i = n-1; i > 0; i--) {
            System.out.print(arr1[i]);
        }

        //This below code will reverse each "word" of the line

        //  String p ="";
        // String str ="";
        // for(int i=S.length()-1 ;i>=0;i--){
            
        //     if(S.charAt(i)!='.'){
        //         p = S.charAt(i)+p;
        //     }
        //     else{
        //         str = str+p+".";
        //         p="";
        //     }
            
        // }
        // str=str+p;
        // return str;
    }

}
