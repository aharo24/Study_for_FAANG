package BinaryTree;

public class BinarySearchTree {
    public TreeNode root;

    public void insert(int val) {
        root = insert(root, val);
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // public TreeNode searchForKey(int key) {
    // return searchHelper(root, key);
    // }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(9);
        tree.insert(6);
        tree.insert(2);

        // tree.inOrder();

    }
}
