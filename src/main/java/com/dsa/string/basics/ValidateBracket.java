package com.dsa.string.basics;

import java.util.Stack;

public class ValidateBracket {
    public static void main(String[] args) {
        String s = "{([])}";

        if (isValidBracket(s)) {
            System.out.println("✅ Brackets are balanced");
        } else {
            System.out.println("❌ Brackets are NOT balanced");
        }
    }

    // ✅ Function to validate brackets using Stack
    private static boolean isValidBracket(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // For closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty, mismatch
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!matches(top, c)) {
                    return false;
                }
            }
        }

        // Stack should be empty if brackets are balanced
        return stack.isEmpty();
    }

    // ✅ Helper method to check if pair matches
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}
