import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
    
}

public class CompletebinaryTree {
    Node root;

    // Constructor
    public CompletebinaryTree() {
        root = null;
    }

   
    public void insert(int data) {
        Node newNode = new Node(data);
        
        if (root == null) {
            root = newNode;
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            
            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.add(current.left);
            }
            
      
            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.add(current.right);
            }
        }
    }

    //Level Order Traversal
    public void levelOrderTraversal() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        CompletebinaryTree tree = new CompletebinaryTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);

        // Display the tree in level order
        System.out.println("Level-order traversal of the complete binary tree:");
        tree.levelOrderTraversal();
    }
}




