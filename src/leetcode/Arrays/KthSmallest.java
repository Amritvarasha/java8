package leetcode.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kth position");
        int k = sc.nextInt();
        int[] arr = {1,3,4,5,3,0};
        Arrays.sort(arr);
        System.out.println(k+"th smallest element is "+arr[k-1]);
    }
}
