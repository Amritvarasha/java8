//package leetcode.String;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class GetAllPermutation {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input  = sc.nextLine();
//        permutation(input);
//    }
//
//    private static Set<String> permutation(String input) {
//        Set<String> permute = new HashSet<>();
//        if(input==null){
//            return null;
//        }else if(input.length()==0){
//            permute.add("");
//            return permute;
//        }
//        char first = input.charAt(0);
//        String sub = input.substring(1);
//        Set<String> words = permutation(sub);
//        for(String strnew:words){
//            for(int)
//        }
//    }
//}
