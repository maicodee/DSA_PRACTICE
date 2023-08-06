package Arrays.Medium_Array;
import java.util.Scanner;
public class P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int arr1[] = new int[a1];

        for (int i = 0; i < a1; i++) {
            arr1[i] = sc.nextInt();
        }

        int a2 = sc.nextInt();
        int arr2[] = new int[a2];

        for (int i = 0; i < a2; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();

   
    }
}