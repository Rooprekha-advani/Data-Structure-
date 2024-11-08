package Lab08;

public class RemoveOddNode {
    class Node
    {
        int data;
        Node next;
        Node(int data) {
            this.data= data;
            this.next= null;
        }
    }

    Node head;
    public  void deleteNode(int value) {
     
        if (head == null) 
        return ;
        

        if (head.data == value){
            head = head.next;
            return;
          }

          Node temp = head;
          while (temp.next != null && temp.next.data !=value){
            temp = temp.next.next;
          }
        
          
        
       

    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


     public static void main(String[] args) {
        RemoveOddNode list = new RemoveOddNode();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original List:");
        list.display();

        list.deleteNode(2);

        System.out.println("List after deleting node with value 2:");
        list.display();
     }    
}
