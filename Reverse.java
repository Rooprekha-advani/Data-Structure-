class Node {
    int data;
    Node next;

    
    Node (int data) {
        this.data=data;
        this.next=null;
    }
}
class linkedlist 
{
    Node head;
    Node tail;
    int size =0;

   void addlast  (int data)     {
    Node newNode =new Node (data);
    if (head == null)    {
        head = newNode;
        tail = newNode; 
    }
    else        {
        tail.next =newNode;
        tail=newNode;  
      }
   }

   void reverse(){
    for (int i=0; i<size; i++){
        Node temp = head;
        for (int j=1; j<size-i; j++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
   }


   //method
   void printlist ()
   {
    Node newNode =head;
    while (newNode.next != null)
    {
        System.out.println(newNode.data + " ");
        newNode = newNode.next;
    }
    System.out.println(newNode.data);
   }

  /* 

  //method to reverse the element 
   public linkedlist Reversed() {
    linkedlist reversedList = new linkedlist(); 

    Node temp = head; 
    while (temp != null) { 
        Node newNode = new Node(temp.data);
        
        newNode.next = reversedList.head;  
        reversedList.head = newNode;  

        temp = temp.next; 
    }

    return reversedList; 
}*/

   

}



public class Reverse {
    public static void main (String args[]) {

    linkedlist list = new linkedlist();
    list.addlast(45);
    list.addlast(46);
    list.addlast(47);
    list.printlist();


   list.reverse();
    list.printlist();

/*// Reverse the original list by modifying it
    linkedlist reversedList = list.Reversed();

    // Display the reversed list
    System.out.println("Reversed List:");
    reversedList.printlist();*/


    }   
}
