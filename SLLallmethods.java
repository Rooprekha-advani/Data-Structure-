class Node
{
    int data;
    Node next;
    
    Node (int data)  {
        this.data=data;
        this.next=null;  }
}

class linkedlist 
{
    Node head; 
    int size = 0;

    //method addlastitem by using tail (tail last node)
Node tail;
void addlast  (int data)
{
Node newNode =new Node (data);
if (head == null)
{
    head = newNode;
    tail = newNode; 
}
else 
{
    tail.next =newNode;
    tail=newNode;
}
}
    //method
    void additemtolast (int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
           size ++;
        }
        else
        {
             Node temp = head;
             while (temp.next != null)
             {
                temp =  temp.next;
                }
                temp.next = newNode; 
            size++; }
    }
//method 
    void addtofirst(int data)
    {
       Node newNode = new Node(data);
       Node temp = head;
       head = newNode;
       head.next = temp; 
       si    ze ++;
    }
    //method
   void addinmiddle (int index, int data)
    {
        Node newNode = new Node (data);
        Node temp=head;
        for (int i=0; i<index-1; i++)
        {
            temp = temp.next; 
        }
        newNode.next = temp.next;
        temp.next=newNode; 
        size++;   }

    //method
    int getsize ()
    {
           return size;
    }

    //method to search item 
void search (int key)
{
   Node temp = head;
   int position =0;
   while (temp != null)
   {
    if (temp.data  == key )
    {
     System.out.println ("element found " + key + "position at " + position);
     return ;
    }
    temp= temp.next; 
    position ++;
} 
   System.out.println("element not found" + key);

}

//method 
boolean isEmpty ()
{
 if (head == null)
 {
     return true;
 }
 else 
 {
     return false;
 }
}

// method 
   void removefromfront()
   {
    head = head.next;
   }

   //method 
   public void remove (int index)
   {
    if (index == 1)
    {
        removefromfront();
    }
    else{
        Node n = head;
        Node temp = null;
        for (int i=0; i<index-1; i++)
        {
            n = n.next;
            n.next = temp;
            temp.next = n.next; 
        }
    }
   }

  //method 
public linkedlist duplicateReversed() {
    linkedlist reversedList = new linkedlist(); 

    Node temp = head; 
    while (temp != null) { 
        Node newNode = new Node(temp.data);
        
        newNode.next = reversedList.head;  
        reversedList.head = newNode;  

        temp = temp.next; 
    }

    return reversedList; 
}


//method 
public linkedlist duplicate() {
    linkedlist newList = new linkedlist(); 
    if (head == null) {  
        return newList;  
    }
    Node currentOriginal = head; 
    Node newNode = new Node(currentOriginal.data); 
    newList.head = newNode; 

    while (currentOriginal.next != null) { 
        currentOriginal = currentOriginal.next; 
        newNode.next = new Node(currentOriginal.data); 
        newNode = newNode.next; 
    }
    return newList; 
}

     //method to print element 
    void printlist ()
    {
        Node newNode = head;
        while (newNode.next != null)
        {
         System.out.println (newNode.data + " ");
         newNode = newNode.next;
        }
        System.out.println (newNode.data);
    }   
}

// main class 
public class SLLallmethods {
    public static void main (String args [])
    {
        linkedlist LI = new linkedlist();
        
        LI.addtofirst(51);
        LI.addtofirst(50); 
        LI.addinmiddle(2,3);
        LI.additemtolast(5);
        LI.additemtolast(10);
        LI.search(2);
        System.out.println( LI.getsize());
        LI.printlist ();



         // Reverse the original list by modifying it
         linkedlist reversedList = LI.duplicateReversed();
         // Display the reversed list
         System.out.println("Reversed List:");
         reversedList.printlist();



         System.out.println("Original List:");
        LI.printlist();
        // Duplicate the list
        linkedlist duplicateList = LI.duplicate();
       // Display the duplicated list
        System.out.println("Duplicated List:");
        duplicateList.printlist();
        System.out.println("Original List:");
        LI.printlist();
    }
    
}


