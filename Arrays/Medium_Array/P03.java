// You are given a list of n-1 integers and these integers are in the range of 1 to n. 
// There are no duplicates in the list. One of the integers is missing in the list. 
// Write an efficient code to find the missing integer.
// Input:
// N = 5
// A[] = {1,2,3,5}
// Output: 4

package Arrays.Medium_Array;

public class P03 {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; 
        int totalSum = (n * (n + 1)) / 2; 

        int sum = 0;
        for (int num : nums) {
            sum += num; 
        }

        return totalSum - sum; 
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = {1, 2, 3, 5};
        int missingNumber = findMissingNumber(A);
        System.out.println("Missing integer: " + missingNumber);
    }
}
