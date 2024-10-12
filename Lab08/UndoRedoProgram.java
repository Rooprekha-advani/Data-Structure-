package Lab08;
class Node 
{
    int data;
    Node next;

    Node (int data)
    {
        this.data = data;
        this.next = null;
     }
}
class UorRProgram 
{
    Node head;
    public void push (int data)
    {
       Node newNode = new Node(data);
       if (head == null)
       {
        head = newNode;
       }
       else {
        Node temp = head;
       while (temp.next != null) {
        temp = newNode;
       }
       temp.next = newNode;
    }

    }

    int Undo ()   
    {
     if ( head == null )     {
        return -1;
     }
     else{
        int data = head.data;
        head = head.next;
        return data;       
      }
    }



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
public class UndoRedoProgram {
    public static void main (String args [])
    {
        UorRProgram u = new UorRProgram();
        u.push(1);
        u.printlist();
    }
    }
