class 

{
    int data;
    Node next;
    Node prev;
    
    Node (int data)  {
        this.data=data;
        this.next=null; 
    this.prev = null; }
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
    newNode.prev = tail;
    tail=newNode;
}
}

void removelastNode () {
    if (head == null){
        System.out.println("empty");
    }
    else {
       tail = tail.prev;
       tail.next = null;
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
public class Doublywithtail {
    
    public static void main (String args [])
    {
       linkedlist list = new linkedlist();
       System.out.println(" here is the elements in the list");
       list.addlast(10);
       list.addlast(20);
       list.addlast(30);
       list.printlist ();

       System.out.println("here we remove the last node");
       list.removelastNode();
       list.printlist ();
    }
}
