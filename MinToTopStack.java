import java.util.Stack;

public class MinToTopStack {
    
    // Method to move the minimum element to the top of the stack
    static void moveMinToTop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Stack<Integer> tempStack = new Stack<>();
        int minElement = Integer.MAX_VALUE;

        // Step 1: Find the minimum element in the stack
        while (!stack.isEmpty()) {
            int current = stack.pop();
            minElement = Math.min(minElement, current);
            tempStack.push(current);
        }

        // Step 2: Move all elements back to the original stack except the minimum
        boolean minMoved = false;
        while (!tempStack.isEmpty()) {
            int current = tempStack.pop();
            if (current == minElement && !minMoved) {
                minMoved = true; // Skip pushing the minimum element once
            } else {
                stack.push(current);
            }
        }

        // Step 3: Push the minimum element to the top of the stack
        stack.push(minElement);

        // Display the result
        System.out.println("Stack after moving min element to top: " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(2);

        System.out.println("Original Stack: " + stack);
        moveMinToTop(stack);
    }
}

