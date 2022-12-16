package leetcode.stacks;

import java.util.Stack;

public class EqualStacks {
    public static void main(String[] args) {
        int[] h1 = {3,2,1,1,1};
        int[] h2 = {4,3,2};
        int[] h3 = {1,1,4,1};
        equalStacks(h1,h2,h3);
    }

    private static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int maxHeight = 0;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
    fillStacks(st1,h1,st2,h2,st3,h3);
    while(!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty()){
        int stack1Height = st1.peek();
        int stack2Height = st2.peek();
        int stack3Height = st3.peek();
        if(stack1Height==stack2Height && stack2Height==stack3Height){
            maxHeight = st1.peek();
            break;
        }
        if(stack1Height>=stack2Height && stack1Height>=stack3Height){
            st1.pop();
        }else if(stack2Height>=stack1Height && stack2Height>=stack3Height){
            st2.pop();
        }else if(stack3Height>=stack1Height && stack3Height>=stack2Height){
            st3.pop();
        }
    }
    return maxHeight;
    }

    private static void fillStacks(Stack<Integer> st1, int[] h1, Stack<Integer> st2, int[] h2, Stack<Integer> st3, int[] h3) {
    int st1TotalHeight = 0, st2TotalHeight = 0,st3TotalHeight = 0;
    for(int i =h1.length-1;i>=0;i--){
        st1TotalHeight+=h1[i];
        st1.push(st1TotalHeight);
    }
        for(int i =h2.length-1;i>=0;i--){
            st2TotalHeight+=h2[i];
            st1.push(st2TotalHeight);
        }
        for(int i =h3.length-1;i>=0;i--){
            st3TotalHeight+=h3[i];
            st1.push(st3TotalHeight);
        }

    }
}
