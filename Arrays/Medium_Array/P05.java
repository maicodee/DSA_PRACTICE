// Find duplicates in an array.
// Input:
// N = 4
// a[] = {0,3,1,2}
// Output: 
// -1
// Explanation: 
// There is no repeating element in the array. Therefore output is -1.

package Arrays.Medium_Array;
import java.util.ArrayList;


public class P05{
    public static void main(String[] args) {
        int[] a = {0, 3, 1, 2};
        int n = a.length;

        ArrayList<Integer> seen = new ArrayList<>();
        int duplicate = -1;

        for (int i = 0; i < n; i++) {
            int currentElement = a[i];
            if (seen.contains(currentElement)) {
                duplicate = currentElement;
                break; // Exit the loop as soon as a duplicate is found
            } else {
                seen.add(currentElement);
            }
        }

        if (duplicate == -1) {
            System.out.println("-1"); // No duplicates found
        } else {
            System.out.println(duplicate); // Print the first duplicate found
        }
    }
}