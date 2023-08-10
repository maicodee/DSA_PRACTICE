// Write a program to count the number of occurrences of each character in the string and print it.
// Input : geeksforgeeks
// Output :
// Number of Occurrence of g is:2
// Number of Occurrence of e is:4
// Number of Occurrence of k is:2
// Number of Occurrence of s is:2
// Number of Occurrence of f is:1
// Number of Occurrence of o is:1
// Number of Occurrence of r is:1

package String.Easy_string;

import java.util.Scanner;
public class P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String string = sc.nextLine().toLowerCase(); //// Convert input to lowercase
        int arr[] = new int[256];

        for(char ch: string.toCharArray()){
            arr[ch]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                System.out.println("Occurance of   "+  (char)i + "  was  " + arr[i]);
            }
        }
        
        sc.close();

    }

    
}
