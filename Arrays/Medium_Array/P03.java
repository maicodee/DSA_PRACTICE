// You are given a list of n-1 integers and these integers are in the range of 1 to n. 
// There are no duplicates in the list. One of the integers is missing in the list. 
// Write an efficient code to find the missing integer.
// Input:
// N = 5
// A[] = {1,2,3,5}
// Output: 4

package Arrays.Medium_Array;
import java.util.Scanner;
public class P03 {
    public static int findMissingNumber(int N, int[] A) {
        int totalSum = (N * (N + 1)) / 2; 

        int sum = 0;
        for (int num : A) {
            sum += num; 
        }

        return totalSum - sum; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int[] A = new int[N - 1];
        System.out.println("Enter the array of " + (N - 1) + " integers:");
        for (int i = 0; i < N - 1; i++) {
            A[i] = scanner.nextInt();
        }

        int missingNumber = findMissingNumber(N, A);
        System.out.println("Missing integer: " + missingNumber);

        scanner.close();
    }
}
