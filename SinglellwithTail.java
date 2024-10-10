class Node
{
    int data;
    Node next;
    Node (int data)  {
        this.data=data;
        this.next=null; 
     }
}

class linkedlist 
{
    Node head; 
    Node tail;
    
//method addlastitem by using tail (tail last node)
void addlast  (int data)  {
Node newNode =new Node (data);
if (head == null)    {
    head = newNode;
    tail = newNode; 
}
else    {
    tail.next =newNode;
    tail=newNode;
}
}

void printlist (){
    Node newNode =head;
    while (newNode.next != null)            {
        System.out.println(newNode.data + " ");
        newNode = newNode.next;
    }
    System.out.println(newNode.data);   
}
}

    public class SinglellwithTail {
    public static void main(String[] args) {
        
    linkedlist list = new linkedlist();
       System.out.println(" here is the elements in the list");
       list.addlast(11);
       list.addlast(12);
       list.addlast(13);
       list.printlist ();       }
    
}
