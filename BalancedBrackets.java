import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++)   {  //each character in string
            char ch = str.charAt(i);
            
            if (ch == '(' || ch == '[' || ch == '{') {   //push it onto the stack
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') {  //  check if it matches the top of the stack
                
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty at the end, the brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with brackets: ");
        String input = scanner.nextLine();
        
        // Check if the brackets are balanced and print the result
        if (isBalanced(input)) {
            System.out.println("The brackets are balanced.");
        } else {
            System.out.println("The brackets are not balanced.");
        }
        
        scanner.close();
    }
}
