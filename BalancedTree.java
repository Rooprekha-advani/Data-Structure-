class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BalancedTree{
    
    // Function to check if tree is balanced
    public boolean balanceTree(Node root) {
        return checkHeight(root) != -1;
    }

    
    private int checkHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; 
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; 

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; 
        }

        return Math.max(leftHeight, rightHeight) + 1; 
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Is the tree balanced? " + tree.BalancedTree(root));
    }
}



