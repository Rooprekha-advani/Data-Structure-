class Node
{
    int data;
    Node left;
    Node right;

    Node (int data)
    {
        this.data=data;
        this.left= null;
        this.right = null;
    }
} 

public class BinarytreeMinandMax  {
    Node root;
    int size =0;

    BinarytreeMinandMax (int key)
    {
        root=new Node(key);
    }
    public BinarytreeMinandMax () {
root = null; 
    }

    public void addNode(int data) { 
        Node newnode = new Node (data);
        if (root == null) {
          root=newnode;
        }
        else{
            addNode1 (root,data);
}
        }

        
    
    public void  addNode1 (Node root, int data){
        if (data < root.data) {
            if (root.left == null) {
                root.left = new Node(data);
            } else {
                addNode1(root.left, data);
            }
        } else if (data > root.data) { // Added condition to handle right subtree
            if (root.right == null) {
                root.right = new Node(data);
            } else {
                addNode1(root.right, data);
            }
        }
  }

     
 public void minimum (Node root)
  {
   if (root.left == null)
   System.out.println(root.data);
 //  System.out.println(root.data);
  
  else 
  {
   minimum (root.left);
  }
}
public void maximum (Node root)
{
 if (root.right == null)
 System.out.println(root.data);
//  System.out.println(root.data);

else 
{
 maximum (root.right);
}
}



    void printInorder (Node node)
    {
       
     if(node != null)
     {
        printInorder (node.left);
        System.out.println(node.data);
        printInorder (node.right);
         }
    }

    


        public static void main (String args[])
    {
        BinarytreeMinandMax t = new BinarytreeMinandMax();
  t.addNode(0);
  t.addNode(1);
  t.addNode(2);


  t.printInorder(t.root);
  // This will print the tree in order
 System.out.println("min: ");
t.minimum(t.root);
System.out.println("max: ");
t.maximum(t.root);
 

    }
}
    




