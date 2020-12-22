package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

    static int maxLevel = 0;
    static int totalSum = 0;
    Node root;

    LeftView() {
        root = null;
    }

    public static void main(String[] args) {

        LeftView tree = new LeftView();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);

        System.out.println("\nPrint left view of the tree using recursion: ");
        int result = printLeftViewUsingRecursion(tree.root, 1);
//        System.out.println("Sum: "+result);

//        System.out.println("\nPrint Left view of the tree using queue: ");
//        printLeftViewUsingQueue(tree.root);
//
//        System.out.println("\nPrint Right view of the tree using queue: ");
//        printRightViewUsingQueue(tree.root);
//
//
//        int result = printSumOfLeftView(tree.root);
//        System.out.println("\nPrint sum of left nodes: " + result);


    }

    private static int printSumOfLeftView(Node root) {
        if (root == null) {
            return 0;
        } else if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.data + printSumOfLeftView(root.right);
        } else {
            return printSumOfLeftView(root.left) + printSumOfLeftView(root.right);
        }
    }

    private static void printRightViewUsingQueue(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = q.remove();

                if (i == n) {
                    System.out.print(temp.data + " ");
                }

                // Add left node to queue
                if (temp.left != null) {
                    q.add(temp.left);
                }

                // Add right node to queue
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }

        }
    }

    private static void printLeftViewUsingQueue(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = q.remove();

                if (i == 1) {
                    System.out.print(temp.data + " ");
                }

                // Add left node to queue
                if (temp.left != null) {
                    q.add(temp.left);
                }

                // Add right node to queue
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }

        }
    }

    public static int printLeftViewUsingRecursion(Node root, int level) {
        if (root == null) return -1;
        if (maxLevel < level) {
            System.out.print(" " + root.data);
            maxLevel = level;
        }
        printLeftViewUsingRecursion(root.left, level + 1);
        printLeftViewUsingRecursion(root.right, level + 1);
        return totalSum;
    }


}
