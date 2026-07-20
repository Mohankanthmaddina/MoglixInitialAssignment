package src;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestValidParenthesesSubstring {
    
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return 0; //base condition for handling the length=0 and null value handling
        }

        int n = s.length();
        // Manual primitive array stack to store indices
        int[] stack = new int[n + 1]; 
        int top = -1;

        // Base case: push -1 to act as the initial boundary
        stack[++top] = -1;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // Push the index of '(' onto the manual stack
                stack[++top] = i;
            } else {
                // Pop the top index
                top--;

                if (top == -1) {
                    // If empty, this ')' is a new invalid boundary base
                    stack[++top] = i;
                } else {
                    // Calculate length of the current valid substring
                    int currentLength = i - stack[top];
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                    }
                }
            }
        }

        return maxLength;
    }
    public static void main(String[] args) throws java.lang.Exception{
        LongestValidParenthesesSubstring solver = new LongestValidParenthesesSubstring();

        // Example 1
        String s1 = "(()";
        System.out.println("Input: s = \"" + s1 + "\"");
        System.out.println("Output: " + solver.longestValidParentheses(s1));
        System.out.println();

        // Example 2
        String s2 = ")()())";
        System.out.println("Input: s = \"" + s2 + "\"");
        System.out.println("Output: " + solver.longestValidParentheses(s2));
        System.out.println();

        // Example 3
        String s3 = "";
        System.out.println("Input: s = \"" + s3 + "\"");
        System.out.println("Output: " + solver.longestValidParentheses(s3));
    }
}