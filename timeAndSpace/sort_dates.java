// Input :-

// 5
// 12041996
// 20101996
// 05061997
// 12041989
// 11081987

// Output :-

// 11081987
// 12041989
// 12041996
// 20101996
// 05061997



package timeAndSpace;

import java.util.Scanner;

public class sort_dates {
    public static void sortDates(String[] arr) {
        countSort(arr , 1000000 , 100 , 32);
        countSort(arr , 10000 , 100 , 13);
        countSort(arr , 1 , 10000 , 2501);
    }
    
    public static void countSort(String[] arr,int div, int mod, int range) {
        int freq[] = new int[range];

        for(int i = 0 ; i < arr.length ; i++) {
            freq[Integer.parseInt(arr[i] , 10) / div % mod]++;
        }

        for(int i = 1 ; i < range ; i++) {
            freq[i] += freq[i-1];
        }

        String res[] = new String[arr.length];

        for(int i = arr.length-1 ; i >= 0 ; i--) {
            int pos = freq[Integer.parseInt(arr[i] , 10) / div % mod]-1;
            res[pos] = arr[i];
            freq[Integer.parseInt(arr[i] , 10) / div % mod]--;
        }

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = res[i];
        }
    }
    
    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Output :-");

        int n = scn.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }

        System.out.println("Output :-");
        sortDates(arr);
        print(arr);

        scn.close();
    }
}
