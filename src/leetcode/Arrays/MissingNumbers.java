//package leetcode.Arrays;
//
//import java.util.Arrays;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class MissingNumbers {
//    public static void main(String[] args) {
//        int[] brr = {7, 2, 5, 4, 6, 3, 5, 3, 1, 1};
//        int[] arr = {7, 2, 5, 3, 5, 3};
//
//        System.out.println(Arrays.toString(missingNumbers(arr, brr)));
//    }
//
//    private static int[] missingNumbers(int[] arr, int[] brr) {
//        TreeMap<Integer, Integer> integerFreqMap = new TreeMap<>();
//        // add elements to the original list
//        for (int i : brr) {
//            int freq = integerFreqMap.getOrDefault(i, 0);
//            freq++;
//            integerFreqMap.put(i, freq);
//        }
//        //remove elements of the new list
//        for (int i : arr) {
//            int freq = integerFreqMap.get(i);
//            freq--;
//            if (freq == 0) {
//                integerFreqMap.remove(i);
//            } else {
//                integerFreqMap.put(i, freq);
//            }
//            //create the result array
//            int[] result = new int[integerFreqMap.size()];
//            int j = 0;
//            for (Map.Entry<Integer, Integer> integerIntegerEntry : integerFreqMap.entrySet()) {
//                result[j++] = integerIntegerEntry.getKey();
//            }
//
//        }
//
//        int[] result;
//        return result;
//    }
//}
