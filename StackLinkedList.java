class Node {
    int data;  
    Node next; 

    Node(int data) {
        this.data = data;
        this.next = null;   }
}

class Stack {
    Node top; 
    int size = 0; 

    Stack() {
        this.top = null;
    }

    void push(int x) {
        Node newNode = new Node(x); 
        if (top == null) {
            top = newNode; 
        } else {
            newNode.next = top;  
            top = newNode;        
            }
        size++; 
        System.out.println(x + " pushed to stack.");
    }

 
    // Utility function to check if the stack is empty or not
 boolean isEmpty()   {
      return top == null; 
 }

 // Utility function to return top element in a stack
 int top()     {
    if (isEmpty ()) {
        System.out.println ("Stack is empty");
    }
    else {
        System.out.println(top.data) ;
    }
    return top.data ;
 }

  // Utility function to pop top element from the stack and check for Stack underflow
int pop()   
{
 if ( isEmpty())     {
    return -1;
 }
 else{
    int data = top.data;
    top = top.next;
    return data;         }
}

}

class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1); 
        stack.push(2); 
        stack.push(3); 
    System.out.println("Top element is " + stack.top());
    System.out.println("pop element" + stack.pop());
    System.out.println("pop element" + stack.pop());
    System.out.println("pop element" + stack.pop());
 
   if (stack.isEmpty()) {
 System.out.print("Stack is empty");
 } 
 else {
 System.out.print("Stack is not empty");         }
 }
    }

