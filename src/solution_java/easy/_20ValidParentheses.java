package solution_java.easy;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _20ValidParentheses {
    public class Solution {
        public boolean isValid(String s) {
            int n = s.length();
            if (n % 2 == 1) {
                return false;
            }
            Deque<Character> stack = new LinkedList<>();
            Map<Character, Character> pairs = new HashMap<Character, Character>() {{
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }};
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (pairs.containsKey(ch)) {
                    if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                        return false;
                    }
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            return stack.isEmpty();
        }
    }
}
