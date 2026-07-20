package tests;
import src.LongestValidParenthesesSubstring;
public class TestCases {
    public static void main(String[] args) {
        LongestValidParenthesesSubstring solver = new LongestValidParenthesesSubstring();

        System.out.println("TC1: " + solver.longestValidParentheses(""));

        System.out.println("TC2: " + solver.longestValidParentheses("("));

        System.out.println("TC3: " + solver.longestValidParentheses("()"));

        System.out.println("TC4: " + solver.longestValidParentheses("(()"));

        System.out.println("TC5: " + solver.longestValidParentheses(")()())"));

        System.out.println("TC6: " + solver.longestValidParentheses("((()))"));

        System.out.println("TC7: " + solver.longestValidParentheses("()()()"));

        System.out.println("TC8: " + solver.longestValidParentheses("())(())"));

        System.out.println("TC9: " + solver.longestValidParentheses("((((("));

        System.out.println("TC10: " + solver.longestValidParentheses("(()(()))"));
    }
}
