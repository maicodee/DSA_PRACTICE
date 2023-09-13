// Find all pairs on integer array whose sum is equal to given number.
// Input:
// N = 4, K = 6
// arr[] = {1, 5, 7, 1}
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.

package Arrays.Medium_Array;
import java.util.Scanner;
import java.util.Arrays;
public class P04 {

   public static int countPairsWithSum(int arr[] , int K){
        Arrays.sort(arr); 
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == K) {
                count++;
                left++;
                right--;
            } else if (sum < K) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    
   }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the array of " + N + " integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = countPairsWithSum(arr, K);
        System.out.println("Number of pairs with sum equal to " + K + ": " + result);

        scanner.close();
    }
}