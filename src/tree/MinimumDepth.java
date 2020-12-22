package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepth {

    Node root;

    MinimumDepth() {
        root = null;
    }

    public static void main(String[] args) {
        MinimumDepth tree = new MinimumDepth();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);

        int depth = tree.printMinimumDepth(tree.root);
        System.out.println("Minimum depth of the tree is " + depth);

    }

    public int printMinimumDepth(Node root) {
        if (root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 0;

        while (!q.isEmpty()) {
            int n = q.size();

            while (n > 0) {
                Node current = q.remove();
                if (current.left == null && current.right == null) {
                    depth++;
                    return depth;
                }

                // Add left node to queue
                if (current.left != null) {
                    q.add(current.left);
                }

                // Add right node to queue
                if (current.right != null) {
                    q.add(current.right);
                }
                n--;
            }
            depth++;
        }
        return 0;
    }
}
