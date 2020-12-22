package tree;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 * <p>
 * Note: A leaf is a node with no children.
 */
public class PathSum {
    Node root;

    PathSum() {
        root = null;
    }

    public static void main(String[] args) {
        PathSum tree = new PathSum();
        tree.root = new Node(5);
        tree.root.left = new Node(4);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(11);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.right = new Node(2);

        tree.root.right.left = new Node(13);
        tree.root.right.right = new Node(4);
        tree.root.right.right.right = new Node(1);


        System.out.println(tree.hasPathSum(tree.root, 22));

    }

    public boolean hasPathSum(Node root, int sum) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null && sum - root.data == 0) {
            return true;
        } else {
            return hasPathSum(root.left, sum - root.data) ||
                    hasPathSum(root.right, sum - root.data);
        }
    }

}
