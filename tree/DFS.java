package tree;

public class DFS {
    Node root;

    DFS() {
        root = null;
    }

    public static void main(String[] args) {
        DFS tree = new DFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root);

        System.out.println("\nPreorder traversal of binary tree is ");
        tree.printPreorder(tree.root);

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostOrder(tree.root);

    }

    public void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public void printPreorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public void printPostOrder(Node root) {
        if (root == null) return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }
}
