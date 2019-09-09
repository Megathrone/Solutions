import java.util.ArrayList;
import java.util.List;

class QueueImpl {

    // Store elements
    // Using dynamic array and an index pointing to the head of queue
    private List<Integer> data;
    // a pointer to indicate the start position
    private int p_start;

    public QueueImpl() {
        data = new ArrayList<>();
        p_start = 0;
    }

    // insert an element into the queue.
    // return true if the operation is successful
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    // delete and element from the queue
    // reutrn true if the operation is successful
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    // get the front element from the queue
    public int Front() {
        return data.get(p_start);
    }

    // checks whether the queue is empty or not
    public boolean isEmpty() {
        return p_start >= data.size();
    }


    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }
}
