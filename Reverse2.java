class Node  {
    int data;
    Node next;
    Node (int data)  {
        this.data=data;
        this.next=null;  }
}
public class Reverse2 {
    Node head;
    void Addfirst(int data){

        Node newNode = new Node(data);
       Node temp = head;
       head = newNode;
       head.next = temp; 
 }

void printlistreverse (){
    Reverse2 list = new Reverse2 ();
    Node temp = head;
    while (temp!= null){
        list.Addfirst(temp.data);
        temp = temp.next;
    }
    list.printlist();

 }
 void printlist (){
    
    Node temp = head;
    while (temp!= null){
        System.out.println(temp.data);
        temp = temp.next;
    }
 }
    public static void main (String args[]){
        Reverse2 r1 = new Reverse2();
        r1.Addfirst(0);
        r1.Addfirst(1);
        r1.Addfirst(2);
        r1.printlist();
       System.out.println();
        r1.printlistreverse();
        
    }   }
