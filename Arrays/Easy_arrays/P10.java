// 10) Move all the negative elements to one side of the array.

// i/p: 7
// -1 -3 4 5 -3 2 1
// o/p : -1 -3 -3 1 2 4 5


import java.util.Scanner;

class P10{

    public static int partition(int[] arr ,int low,int high){
        int pivot = arr[high];
        int i = low-1;

    for(int j= low; j<high;j++){
        if (arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
     i++;
    int temp = arr[i];
    arr[i] = arr[high];
    arr[high] = temp;
    return i;
    
    }
    public static void quicksort(int arr[] , int low, int high) {
        if(low<high){
            int pidx = partition(arr, low, high);

            quicksort(arr, low,pidx-1);
            quicksort(arr,pidx+1,high);
        }
        
    }
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int arr[] = new int[k];
        for(int i =0;i<k;i++){

            arr[i] = sc.nextInt();

        }
        
        int n = arr.length;
        sc.close();
        quicksort(arr,0,n-1);

        for(int j =0;j<k;j++){
            System.out.print(arr[j] + " ");
        }
    }
}

/*
 * Approach
 * 
 * Brute: just sort the array 
 * 
 * Optimal:
 * 
 * More optimal:
 * 
 */