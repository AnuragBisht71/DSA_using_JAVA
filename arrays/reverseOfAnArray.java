// Input :-

// 5 --> no. of elements
// 1
// 2
// 3
// 4
// 5

// Output :-

// 5 4 3 2 1

package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class reverseOfAnArray {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo < hi) {
      int tmp = a[lo];
      a[lo] = a[hi];
      a[hi] = tmp;

      lo++;
      hi--;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter input:-");

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    System.out.println("Output :-");
    reverse(a);
    display(a);
  }
}
