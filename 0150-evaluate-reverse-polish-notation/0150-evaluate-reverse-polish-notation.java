
import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            String ch = tokens[i];

            if (!ch.equals("+") && !ch.equals("-") &&
                !ch.equals("*") && !ch.equals("/")) {

                stack.push(Integer.parseInt(ch));

            } else {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                if (ch.equals("+")) {
                    result = a + b;
                }
                else if (ch.equals("-")) {
                    result = a - b;
                }
                else if (ch.equals("*")) {
                    result = a * b;
                }
                else if (ch.equals("/")) {
                    result = a / b;
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }
}
