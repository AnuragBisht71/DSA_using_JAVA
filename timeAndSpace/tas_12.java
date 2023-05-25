// Quick Sort

// Input :-

// 5 --> no. of elements in an array
// 7 
// -2 
// 4 
// 1 
// 3

// Output :-

// pivot -> 3
// Swapping -2 and 7
// Swapping 1 and 7
// Swapping 3 and 4
// pivot index -> 2
// pivot -> 1
// Swapping -2 and -2
// Swapping 1 and 1
// pivot index -> 1
// pivot -> -2
// Swapping -2 and -2
// pivot index -> 0
// pivot -> 4
// Swapping 4 and 7
// pivot index -> 3
// pivot -> 7
// Swapping 7 and 7
// pivot index -> 4
// -2 1 3 4 7 



package timeAndSpace;

import java.util.Scanner;

public class tas_12 {
    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return;
        }

        int pivot = arr[hi];
        int pIdx = partition(arr, pivot, lo, hi);
        quickSort(arr, lo, pIdx - 1);
        quickSort(arr, pIdx + 1, hi);

    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {
        System.out.println("pivot -> " + pivot);
        int i = lo, j = lo;
        while (i <= hi) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println("pivot index -> " + (j - 1));
        return (j - 1);
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Output :-");
        quickSort(arr, 0, arr.length - 1);
        print(arr);

        scn.close();
    }
}
