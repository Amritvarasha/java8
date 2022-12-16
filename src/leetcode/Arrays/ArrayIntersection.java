package leetcode.Arrays;

import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {1,5,1};
        int[] nums2 = {1,1,3,5,5,4};
        System.out.println("Array intrsection value is "+Arrays.toString(ArrayIntersection.findIntersection(nums1,nums2)));
    }

    private static  int[] findIntersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int first = 0;
        int second = 0;
        int[] output = new int[nums1.length];
        int k =0;
        while(first<nums1.length&&second<nums2.length){
            if(nums1[first]==nums2[second]){
                output[k]=nums1[first];
                first++;
                second++;
                k++;
            }else if(nums1[first]>nums2[second]){
                second++;
            }else
                first++;
        }
        return output;

    }
}
