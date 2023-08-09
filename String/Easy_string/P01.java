// 1. Write a basic program to take input (String) from User and just print it.

package String.Easy_string;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String string = sc.nextLine();
        System.out.println(string);

        sc.close();
    }
    
}
