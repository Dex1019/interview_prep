package tree;

import java.util.*;

public class BFS {
    Node root;

    BFS() {
        root = null;
    }

    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(15);
        tree.root.left.right = new Node(7);

        System.out.println("\nLevel order traversal of binary tree is ");
        List<List<Integer>> result = tree.printLevelOrder(tree.root);

        System.out.println(Arrays.toString(result.toArray()));

    }

    public List<List<Integer>> printLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return null;

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node temp = q.remove();
                currentLevel.add(temp.data);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
