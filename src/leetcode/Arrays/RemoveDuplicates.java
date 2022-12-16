package leetcode.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = 3;
        int value = RemoveDuplicates.remove(nums);
        System.out.println("duplicate value is "+value );
    }

    private static int remove(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;

    }
}
