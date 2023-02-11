package org.example;

import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalanced(String s){
//      First Code
//        int openCount=0;
//        int closeCount=0;
//
//        for (int i=0; i<s.length(); i++){
//            char c= s.charAt(i);
//
//            if (c=='('){
//                openCount++;
//
//            } else if (c==')') {
//                closeCount++;
//                if (closeCount>openCount){
//                    return false;
//                }
//            }
//        }
//
//        return openCount == closeCount;


        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
