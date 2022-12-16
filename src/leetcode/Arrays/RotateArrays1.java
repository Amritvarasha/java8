package leetcode.Arrays;

import java.util.Arrays;

public class RotateArrays1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int start, int end) {
//        int n  = arr.length;
//        for(int i=0;i<n/2;i++){
//            int temp = arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
        if(start>end)return;
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr,start+1,end-1);

        }
    }



