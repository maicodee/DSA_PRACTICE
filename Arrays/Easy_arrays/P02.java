//Write a code to check if a number is present in a string or not

import java.util.Scanner;

public class P02 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check in array");

        int number = sc.nextInt();
        System.out.println("Enter size of array");

        int n = sc.nextInt();
        System.out.println("Enter array elements");

        int arr[] = new int[n];
        sc.close();

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        boolean ispresent = false;

        for (int j = 0; j < n; j++)

        {
            if (arr[j] == number) {
                ispresent = true;
            }
        }
        if (ispresent == true) {
            System.out.println("Number is present");
        }

        else {
            System.out.println("Number is not present");
        }
    }
}


