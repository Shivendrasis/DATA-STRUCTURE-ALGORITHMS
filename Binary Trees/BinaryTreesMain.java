import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesMain {

    // Node class
    static class Node {
        
        int data;
        Node left, right;

        Node(int data) {

            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        // method
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

    }

    // preorder method
    // why preOrder steps - R_L_R
    public static void preOrder(Node root) {
        // base case
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // InOrder traversal method
    // why InOrder steps - L_R_R
    public static void inOrder(Node root) {
        // base case
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // postOrder traversal method
    // why postOder traversal - L_R_R
    public static void postOder(Node root) {
        // base case
        if (root == null) {
            return;
        }
        postOder(root.left);
        postOder(root.right);
        System.out.print(root.data + " ");
    }

    // Level-order traversal method
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // count nodes method
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return (leftCount + rightCount) + 1;
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Pre-Order Treversal : ");
        preOrder(root);

        System.out.println();

        System.out.println("In-Order Traversal : ");
        inOrder(root);

        System.out.println();

        System.out.println("Post-Order Traversal : ");
        postOder(root);

        System.out.println();

        System.out.println("Level-Order Traversal : ");
        levelOrder(root);

        System.out.println("Total counts of nodes: " + countNodes(root));
    }

}
