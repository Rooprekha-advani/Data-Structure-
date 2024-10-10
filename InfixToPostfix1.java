import java.util.Stack;

public class InfixToPostfix1 {

    // Function to define the precedence of operators
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;  // Lowest precedence
            case '*':
            case '/':
                return 2;  // Higher precedence
        }
        return -1;  // For non-operators
    }

    // Function to convert infix expression to postfix
    public static String convertToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        // Loop through each character in the expression
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If the character is a letter (operand), add it to the result
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            // If the character is an operator, process the stack
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());  // Pop operators with higher or equal precedence
                }
                stack.push(ch);  // Push the current operator onto the stack
            }
        }

        // Pop all the operators left in the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();  // Return the postfix expression
    }

    public static void main(String[] args) {
        String infix = "A+B*C+D";  
        String postfix = convertToPostfix(infix);
        
        // Output the postfix expression
        System.out.println("Postfix expression: " + postfix);
    }
}
