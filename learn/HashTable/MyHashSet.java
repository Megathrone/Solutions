class MyHashSet {


    private int[] set;
    private int index = 0;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        set = new int[100];
    }

    public void add(int key) {

        index = hashCode(key);
        set[index] = key;
    }

    public void remove(int key) {
        int indexR = hashCode(key);
        set[indexR] = set[--indexR];
    }

    /**
     * Returns true if this set did not already contain the specified element
     */
    public boolean contains(int key) {
        int indexC = hashCode(key);
        System.out.println(indexC);
        System.out.println(set[indexC]);
        return set[indexC] == key;
    }

    /**
     * Hash function code here
     */
    private int hashCode(int key) {
        int hash = 17;
        return (key + hash) % 97;
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(58);
        System.out.println(myHashSet.contains(0));

    }
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj = new MyHashSet();
 * obj.add(key); obj.remove(key); boolean param_3 = obj.contains(key);
 */