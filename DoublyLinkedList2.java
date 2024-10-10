class DoublyLinkedList2 {
    Node head;
    Node tail;
    class Node {
        String name;
        Node prev;
        Node next;
    
        Node(String name) {
            this.name = name;
            this.prev = null;
            this.next = null;       }
    }
    
    public DoublyLinkedList2() {
        head = null;
        tail = null;
    }

    // Add node in end of linkedlist, node as parameter   
 public void insertAtEnd(Node node)    { 
    if (head == null) { 
        head = node;
        return;
    }
    else {
 Node temp = head; 
    while (temp.next != null) { 
        temp = temp.next;
    }
    temp.next = node; 
    node.prev = temp; 
}
 } 

    // Insert a node after a node with the specified name
    public void insertAfterName(String name, Node node) {
        Node current = head;
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }
        if (current != null) {  // Node with the given name found
            node.next = current.next;
            node.prev = current;
            if (current.next != null) {
                current.next.prev = node;
            } else {  // Update tail if inserting at the end
                tail = node;
            }
            current.next = node;     }
    }
      // Insert a node before a node with the specified name
    public void insertBeforeName(String name, Node node) {
        Node current = head;
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }
        if (current != null) {  // Node with the given name found
            node.next = current;
            node.prev = current.prev;
            if (current.prev != null) {
                current.prev.next = node;
            } else {  // Update head if inserting at the beginning
                head = node;
            }
            current.prev = node;
        }
    }

    // Make the doubly linked list circular
    public void makeCircular() {
        if (head != null && tail != null) {
            tail.next = head;
            head.prev = tail;
        }
    }

    // Print all nodes in the list
    public void printAll() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.name + " ");
            current = current.next;
        } while (current != null && current != head);  // Ensure it works for circular lists
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList2 list = new DoublyLinkedList2();
         // Inserting nodes at the end
        list.insertAtEnd(list.new Node("Roop"));
        list.insertAtEnd(list.new Node("Rekha"));
        list.insertAtEnd(list.new Node("Advani"));

        // Inserting after a node
        list.insertAfterName("Rekha", list.new Node("Rekha2"));
        // Inserting before a node
        list.insertBeforeName("Advani", list.new Node("Advani2"));
        // Make the list circular
        list.makeCircular();
        // Print all nodes
        list.printAll();
    }
}
