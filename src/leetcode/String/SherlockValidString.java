package leetcode.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockValidString {
    public static void main(String[] args) {
        String str = "ABCDEEDCBAE";
        System.out.println(isValid(str));

    }

    private static String isValid(String str) {
        Map<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            int freq = hmap.getOrDefault(str.charAt(i),0);
            hmap.put(str.charAt(i),freq+1);
        }
    int [] arr = new int[hmap.size()];
        int idx =0;
        for(Map.Entry<Character,Integer> hmapEntry: hmap.entrySet()){
            arr[idx++]=hmapEntry.getValue();
        }
        Arrays.sort(arr);
        if(hmap.size()==1)return "YES";
        int first =arr[0];
        int second = arr[1];
        int secondLast = arr[arr.length-2];
        int last = arr[arr.length-1];
        if(first==last) return "YES";
        if(first==1 && second==last) return "YES";
        if(first==second && second==secondLast && secondLast==(last-1)) return "YES";
        return "NO";

    }
}
