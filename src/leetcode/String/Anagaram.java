package leetcode.String;

import java.util.Locale;

public class Anagaram {
    public static void main(String[] args) {
        String str1 = "dormitory";
        String str2 = "Dirtyroom";
        System.out.println(checkAnagram(str1,str2));
    }

    private static Boolean checkAnagram(String str1, String str2) {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        str1= str1.replace(" ","");
        str2=str2.replace(" ","");
        int[] alpha = new int[26];
        for(int i=0;i<str1.length();i++){
            alpha[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            alpha[str2.charAt(i)-'a']--;
        }
        for(int count:alpha){
            if(count!=0){
                return false;
            }
        }

        return true;
    }
}
