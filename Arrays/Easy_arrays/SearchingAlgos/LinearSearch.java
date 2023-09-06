package SearchingAlgos;

import java.util.Scanner;;

//This algorithm basically searches through array
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        sc.close();
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.println("Element found at " + (i + 1) + " position");
                break;
            }

        }
        if (i == n) {

            System.out.println("Element not found");
        }
    }

}
