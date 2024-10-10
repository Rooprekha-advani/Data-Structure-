class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycleDetector {

    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; 
        }

        Node slow = head; // moves one step 
        Node fast = head; // moves two steps 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 

            if (slow == fast) { // If slow and fast meet, cycle exists
                return true;
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        
        LinkedListCycleDetector detector = new LinkedListCycleDetector();
        
        //creates cycle 
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; 

        boolean result = detector.hasCycle(head);
        System.out.println("Cycle detected: " + result); 
    }
}
