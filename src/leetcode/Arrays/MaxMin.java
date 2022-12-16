package leetcode.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,9};
        maxMin(arr);
    }

    private static void maxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            min = Math.min(arr[i],min);
            max = Math.max(arr[i],max);
        }
        System.out.println("max is "+max+" min is "+min);
    }
}
