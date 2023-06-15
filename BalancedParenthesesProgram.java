package day16;

import java.util.Stack;

public class BalancedParenthesesProgram {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
        boolean balanced = isBalanced(expression);
        System.out.println("Is the expression balanced? " + balanced);
    }
}
