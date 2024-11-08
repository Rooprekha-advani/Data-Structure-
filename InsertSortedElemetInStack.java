class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedStack {
    private Node top; 

    // Insert element in sorted order
    public void push(int data) {
        Node newNode = new Node(data);

        // Case 1: Stack is empty or new element is the highest
        if (top == null || data > top.data) {
            newNode.next = top;
            top = newNode;
        } else {
            // Case 2: Find the correct position for the new element
            Node current = top;
            while (current.next != null && current.next.data > data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        System.out.println("Inserted: " + data);
    }

    // Display the stack elements
    public void display() {
        Node current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class InsertSortedElemetInStack{
    public static void main(String[] args) {
        SortedStack stack = new SortedStack();

        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(7);
        stack.push(4);

        System.out.println("Final Stack:");
        stack.display();
    }
}
