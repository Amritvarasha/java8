package leetcode.Arrays;

public class SubArray {

    public static void main(String[] args) {
    int [] arr = {1,2,3};
    int finalValue = 3;
        System.out.println(SubArray.NumberOfSubArray(arr,finalValue));

    }
    public static int NumberOfSubArray(int[] arr,int target){
        int finalCount =0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum +=arr[j];
                if(sum==target)
                    finalCount++;
            }
        }
        
        return finalCount;
    }
}
