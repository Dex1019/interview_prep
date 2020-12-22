package tree;

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * return its depth = 3.
 */
public class MaximumDepth {
    Node root;

    MaximumDepth() {
        root = null;
    }

    public static void main(String[] args) {
        MaximumDepth tree = new MaximumDepth();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);

        int height = tree.printMaximumDepth(tree.root);
        System.out.println("Height of the tree is " + height);
    }

    public int printMaximumDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftSubtreeDepth = printMaximumDepth(root.left);
            int rightSubtreeDepth = printMaximumDepth(root.right);
            return Math.max(leftSubtreeDepth, rightSubtreeDepth) + 1;
        }
    }
}
