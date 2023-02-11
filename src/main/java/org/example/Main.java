package org.example;

import javax.xml.stream.events.DTD;

import static org.example.MissingNumber.missingNumber;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int missing = missingNumber(nums, maxNum);
        System.out.println("The missing number is: " + missing);


        String s= "(Hello World)";

        if (BalancedParenthesis.isBalanced(s)){
            System.out.println("The string has balanced parentheses.");
        }else {
            System.out.println("The string does not have balanced parentheses.");
        }
    }

}