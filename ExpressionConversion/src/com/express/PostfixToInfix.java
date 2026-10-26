
package com.express;

import java.util.Stack;

public class PostfixToInfix {

    public static void main(String[] args) {
        String convertedString = postFixToInfix("54+54-/");
        System.out.println("Ans is: " + convertedString);
    }

    public static String postFixToInfix(String expr) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                if (st.size() < 2) {
                    throw new IllegalArgumentException(
                        "Invalid postfix expression"
                    );
                }

                String num2 = st.pop();
                String num1 = st.pop();

                String result = "(" + num1 + ch + num2 + ")";
                st.push(result);
            }
        }

        if (st.size() != 1) {
            throw new IllegalArgumentException(
                "Invalid postfix expression"
            );
        }

        return st.pop();
    }
}
