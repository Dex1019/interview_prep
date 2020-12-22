package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class InorderUsingStack {
    Node root;

    InorderUsingStack() {
        root = null;
    }

    public static void main(String[] args) {
        InorderUsingStack tree = new InorderUsingStack();
        tree.root = new Node(1);
        tree.root.right = new Node(2);
        tree.root.right.left = new Node(3);


        System.out.println("Inorder tree traversal using stack: ");
        List<Integer> result = tree.printInorder(tree.root);
        System.out.print("\nArray print: " + Arrays.toString(result.toArray()));
    }

    private List<Integer> printInorder(Node root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<Node> s = new Stack<>();
        Node current = root;

        // traverse the tree
        while (current != null || s.size() > 0) {

            // traverse left subtree
            while (current != null) {
                s.push(current);
                current = current.left;
            }

            current = s.pop();
            System.out.print(current.data + " ");
            result.add(current.data);

            // right subtree
            current = current.right;
        }
        return result;
    }
}
