package leetcode.Arrays;

public class FindDuplicatesN {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        System.out.println("the duplicate number is " +FindDuplicatesN.find(arr));
    }

    private static int find(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int index = Math.abs(arr[i]);
            if(arr[index]<0)return index;
            arr[index]=-arr[index];
        }
        return -1;

    }
}
