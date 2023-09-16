// Find common elements in three sorted arrays
// Input:
// n = 5
// v1[] = {3, 4, 2, 2, 4}
// m = 4
// v2[] = {3, 2, 2, 7}
// Output:
// 2 2 3
// Explanation:
// The common elements in sorted order are {2 2 3}

package Arrays.Medium_Array;
import java.util.ArrayList;

public class P07 {
    public static void main(String[] args) {
        int[] v1 = {3, 4, 2, 2, 4};
        int[] v2 = {3, 2, 2, 7};
        int[] v3 = {2, 3, 2, 5};

        ArrayList<Integer> result = findCommonElements(v1, v2, v3);

        // Print the common elements
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    public static ArrayList<Integer> findCommonElements(int[] v1, int[] v2, int[] v3) {
        ArrayList<Integer> commonElements = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < v1.length && j < v2.length && k < v3.length) {
            if (v1[i] == v2[j] && v2[j] == v3[k]) {
                commonElements.add(v1[i]);
                i++;
                j++;
                k++;
            } else if (v1[i] < v2[j]) {
                i++;
            } else if (v2[j] < v3[k]) {
                j++;
            } else {
                k++;
            }
        }

        return commonElements;
    }
}

