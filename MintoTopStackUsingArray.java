import java.util.Arrays;

class ArrayStack {
    private int[] stack;
    private int top;

    // Initialize stack with a fixed size
    public ArrayStack(int size) {
        stack = new int[size];
        top = -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = value;
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Display the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Method to move the minimum element to the top of the stack
    public void moveMinToTop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        // Step 1: Find the minimum element and its index
        int minIndex = top;
        int minValue = stack[top];
        for (int i = top - 1; i >= 0; i--) {
            if (stack[i] < minValue) {
                minValue = stack[i];
                minIndex = i;
            }
        }

        // Step 2: Move elements above minIndex down by one position
        for (int i = minIndex; i < top; i++) {
            stack[i] = stack[i + 1];
        }

        // Step 3: Place the minimum element at the top
        stack[top] = minValue;

        System.out.println("Stack after moving min element to top:");
        display();
    }
}

public class MintoTopStackUsingArray {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(2);

        System.out.println("Original Stack:");
        stack.display();

        stack.moveMinToTop();
    }
}
