package leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr ={2,11,7,15};
        int target = 9;
        //findtwoSum(arr,target);
        //Arrays.sort(findtwoSum(arr,target));
        System.out.println(Arrays.toString(findtwoSum(arr,target)));
    }

    private static int[] findtwoSum(int[] arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return new int[0];
    }
}
