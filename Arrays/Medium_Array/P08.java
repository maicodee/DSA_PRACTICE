// Find the first repeating element in an array of integers
// n = 7
// arr[] = {1, 5, 3, 4, 3, 5, 6}
// Output: 2
// Explanation: 
// 5 is appearing twice and 
// its first appearence is at index 2 
// which is less than 3 whose first 
// occuring index is 3.

// Expected Time Complexity: O(n)
// Expected Auxilliary Space: O(n)

package Arrays.Medium_Array;

import java.util.HashSet;

public class P08 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;

        int firstRepeatingElementIndex = findFirstRepeatingElementIndex(arr, n);

        if (firstRepeatingElementIndex != -1) {
            System.out.println("The first repeating element is " + arr[firstRepeatingElementIndex] + " at index "
                    + firstRepeatingElementIndex);
        } else {
            System.out.println("No repeating elements found.");
        }
    }

    public static int findFirstRepeatingElementIndex(int[] arr, int n) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];

            if (seen.contains(currentElement)) {
                return i;
            } else {
                seen.add(currentElement);
            }
        }

        return -1;
    }
}
