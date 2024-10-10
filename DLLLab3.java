class Node {
    String name;
    Node next;
    Node prev; 
    Node (String name)         {
    this.name = name;
    this.next = null;
    this.prev = null;
    }
   } 

class Doublylinkedlist  {
        Node head;
        int size =0;

        //method
    public void insertAtBeginning(String name) {
    Node newNode = new Node (name);
        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } 
    }
 
//method
        // Add node in beginning of linkedlist, node as parameter
 public void insertAtBeginning(Node node)  {
    if (head == null) {
        head = node;
    }
    else {
        node.next = head;
        head.prev = node;
        head = node;   }
 }

 //method 
  // Add node in end of linkedlist, name as parameter   
  public void insertAtEnd(String name) 
  { 
      Node newNode = new Node(name); 
    
    if (head == null) { 
        head = newNode;
        return;
    }
    else {
 Node temp = head; 
    while (temp.next != null) { 
        temp = temp.next;
    }
    temp.next = newNode; 
    newNode.prev = temp; 
}
}

//method 
 // Add node in end of linkedlist, node as parameter   
 public void insertAtEnd(Node node) 
 { 
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

 //method 
 void printlist () {
    Node newNode =head;
    while (newNode.next != null)            {
        System.out.println(newNode.name + " ");
        newNode = newNode.next;
    }
    System.out.println(newNode.name);           }

}


   public class DLLLab3 {
 public static void main(String[] args) {
    Doublylinkedlist d = new Doublylinkedlist();

    System.out.println("Here is the Nodes");
       d.insertAtBeginning("Roop");
       d.insertAtBeginning("Rekha");
       
       Node n = new Node ("rekha" );
       d.insertAtBeginning(n);


       
       d.insertAtEnd("Advani");
       
       Node nn = new Node ("ii" );
       d.insertAtEnd(nn);  
       d.printlist ();    }   
}
