package leetcode.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,3,5,5};

        System.out.println("single value is "+SingleNumber.findNumber(nums));
    }

    private static int findNumber(int[] nums) {
       int xor=0;
       for(int num:nums){
           xor=xor^num;
       }
        return xor;
    }

}
