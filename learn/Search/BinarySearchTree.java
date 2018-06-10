/**
 * BinarySearchTree
 */
public class BinarySearchTree<Key extends Comparable<Key>, value> {

    private Node root;

    private class Node {
        private Key key;
        private Value val;
        private Node left, right;
        private int N;

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }

    }

    public int size() {
    
        return size(root);
    }

    private int size(Node x) {
        if (null == x)
            return 0;
        else
            return x.N;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (null == x)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            return get(x.left, key);
        else if (cmp > 0)
            return get(x.right, key);
        else
            return x.val;
    }

    public void put(Key key, Value val) {
        return put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
        if (null == x)
            return new Node(key, val, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            x.left = put(x.left, key, val);
        else if (cmp > 0)
            x.right = put(x.right, key, val);
        else
            x.val = val;
        x.N = size(x.left) + size(s.right);
        return x;
    }
}