package leetcode.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,5,5};
        System.out.println("duplicate values are  "+ContainsDuplicate.duplicate(nums) );
    }

    private static Boolean duplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            if(hashSet.contains(nums[i])) return true;
            hashSet.add(nums[i]);
        }
        return false;
    }
}
