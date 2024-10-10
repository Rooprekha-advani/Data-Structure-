class QueueUsingStack {
    private StackArray1 s1, s2;

    QueueUsingStack() {
        s1 = new StackArray1();
        s2 = new StackArray1(); 
    }

    // Enqueue an item to the queue
    public void enqueue(int item) {
        s1.push(item);  
        System.out.println(item + " added to queue");
    }

    // Dequeue an item from the queue
    public int dequeue() {
        // If both stacks are empty, just return -1 (or any value indicating an empty queue)
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1; // Indicating the queue is empty
        }

        // If s2 is empty, transfer all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        // Return the top item from s2
        return (int) s2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); // Prints -1 
    }
}

