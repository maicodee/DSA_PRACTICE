// 1)Create an Array of size 10 of integers. 
// Take input from the user for these 10 elements and print the entire array after that.

import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");

        // Taking input for each element of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Printing the entire array
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Don't forget to close the scanner
        scanner.close();
    }
}
