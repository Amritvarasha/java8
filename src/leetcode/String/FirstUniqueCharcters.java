package leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharcters {
    public static void main(String[] args) {
        String str = "FourByFourfrog";
        int uniqueChars = findUniqueChars(str);
        System.out.println("unique char at index "+uniqueChars);
    }



    private static int findUniqueChars(String str) {
        int index = -1;
        Map<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            int freq = hmap.getOrDefault(str.charAt(i),0);
            hmap.put(str.charAt(i),freq+1);
        }
        for(int i=0;i<str.length();i++){
            if(hmap.get(str.charAt(i))==1){
                index=i;
                break;
            }
        }
        return index;
    }
}
