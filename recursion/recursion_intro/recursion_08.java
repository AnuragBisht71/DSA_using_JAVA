// Tower Of Hanoi

// Input :-

// 3
// 10
// 11
// 12

// Output :-

// 1[10 -> 11]
// 2[10 -> 12]
// 1[11 -> 12]
// 3[10 -> 11]
// 1[12 -> 10]
// 2[12 -> 11]
// 1[10 -> 11]



package recursion.recursion_intro;

import java.util.Scanner;

public class recursion_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();
        int src = scn.nextInt();
        int dest = scn.nextInt();
        int helper = scn.nextInt();

        System.out.println("Output :-");
        toh(n , src , dest , helper);

        scn.close();
    }

    public static void toh(int n, int src, int dest, int helper){
        if(n == 0) {
            return;
        }

        toh(n-1, src , helper , dest);
        System.out.println(n + "[" + src + "->" + dest + "]");
        toh(n-1 , helper , dest , src);
    }
}
