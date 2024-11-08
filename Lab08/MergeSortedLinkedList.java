package Lab08;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null; }
}

class MergeSortedLinkedList {
    static Node mergeLists(Node list1, Node list2) {
        Node dummy = new Node(0);  
        Node current = dummy;

        // Traverse both lists and add nodes in sorted order
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes if any
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        // Merge the lists
        Node mergedList = mergeLists(list1, list2);
        System.out.print("Merged List: ");
        printList(mergedList);
    }
}
