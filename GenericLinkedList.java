//generic linked list
class Node<T> {
    T data; 
    Node<T> next; 

    Node(T data) {
        this.data = data;
        this.next = null; }
}

// Generic Linked List class
class GenericLinkedList<T> {
    Node<T> head; 

    // Constructor to initialize an empty list
    GenericLinkedList() {
        head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data); 

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

   
    public void printList() {
        Node<T> current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list of integers
        GenericLinkedList <Integer> intList = new GenericLinkedList <>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.printList();  
    
        // Create a linked list of strings
        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("Data");
        stringList.add("Structures");
        stringList.add("and Algorthims");
        stringList.printList();  
    }
}


