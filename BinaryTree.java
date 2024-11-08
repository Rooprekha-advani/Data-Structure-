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

public class BinaryTree {
    Node root;
    int size =0;

    BinaryTree(int key)
    {
        root=new Node(key);
    }
    public BinaryTree () {
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


  public boolean searchNode(Node root, int key) {
    if (root == null)
        return false;

    if (root.data == key) {
        return true;
    } else if (root.data > key) {
        return searchNode(root.left, key); // return result of left subtree search
    } else {
        return searchNode(root.right, key); // return result of right subtree search
    }
}


public int countOfNodes(Node root) { 
  if (root == null)
  {
    return 0;
  }
  else 
  {
    return 1 +  countOfNodes(root.left) + countOfNodes(root.right);
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

   //
   public int height(Node root) {
    if (root == null) {
        return -1; // Base case: the height of an empty tree is -1
    }
    
    // Recursively calculate the height of the left subtree
    int leftHeight = height(root.left);
    
    // Recursively calculate the height of the right subtree
    int rightHeight = height(root.right);
    
    // Manually find the maximum between leftHeight and rightHeight
    if (leftHeight > rightHeight) {
        return 1 + leftHeight; // Add 1 to account for the current node
    } else {
        return 1 + rightHeight; // Add 1 to account for the current node
    }
}
    


    


        public static void main (String args[])
    {
  BinaryTree t = new BinaryTree();
  t.addNode(2);
  t.addNode(3);
  t.addNode(4);
  t.addNode(5);
  t.addNode(6);
  t.addNode(7);
  t.addNode(8);



 t.printInorder(t.root);  // This will print the tree in order
 boolean found = t.searchNode(t.root, 1);
 System.out.println("Node with key 3 found: " + found);


 int result = (t.countOfNodes(t.root));
 System.out.println(" size " + result);

 int treeHeight = t.height(t.root);
        System.out.println("Height of the tree: " + treeHeight);
// System.out.println(t.height(t.root));
    }
}
    

