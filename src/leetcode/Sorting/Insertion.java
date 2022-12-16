package leetcode.Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {2,5,7,6,4,2,8,9};
        //sortArray(arr);
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    private static int[] sortArray(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;

        }
        return arr;
    }
}
