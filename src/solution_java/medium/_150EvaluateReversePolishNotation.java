package solution_java.medium;

import java.util.ArrayDeque;

public class _150EvaluateReversePolishNotation {
    public class Solution {
        public int evalRPN(String[] tokens) {
            ArrayDeque<Integer> stack = new ArrayDeque<>();
            for (String ch : tokens) {
                if (isNumber(ch)) {
                    stack.push(Integer.parseInt(ch));
                } else {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    switch (ch) {
                        case "+":
                            stack.push(num1 + num2);
                            break;
                        case "-":
                            stack.push(num2 - num1);
                            break;
                        case "*":
                            stack.push(num1 * num2);
                            break;
                        case "/":
                            stack.push(num2 / num1);
                            break;
                    }
                }
            }
            return stack.pop();
        }

        private boolean isNumber(String ch) {
            return !(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/"));
        }
    }
}
