public class Dummynodehead {
   
    Node head; 
int size;
public Dummynodehead()
{
    head = new Node (0);
    size =0; 
 }

 //method 
 void addtofirst(int data)
 {
    Node newNode = new Node(data);
    Node temp = head;
    head = newNode;
    head.next = temp; 
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


 public static void main(String args[])      {
    Dummynodehead lI=new Dummynodehead ();
     lI.addtofirst(1);
     lI.addtofirst(2);
     lI.addtofirst(3);

     lI.printlist();
}
}
