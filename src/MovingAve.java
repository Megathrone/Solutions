
/**
 * MovingAve 双指针版本
 */
public class MovingAve {


    private int[] data;
    private int totalVal;
    private int head, tail;
    private int size;

    public MovingAve(int size) {
        head = -1;
        tail = -1;
        data = new int[size];
        size = 0;
        totalVal = 0;
    }

    public double next(int val) {
        enQueue(val);
        return (0.0 + totalVal) / size;
    }

    private void enQueue(int val) {
        if (isFull() == true) {
            head = (head + 1) % data.length;
            totalVal -= data[head];
            size--;
        }
        tail = (tail + 1) % data.length;
        data[tail] = val;
        size++;
        totalVal += val;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {
        MovingAve m = new MovingAve(4);
        System.out.println(m.next(4));
        System.out.println(m.next(10));
        System.out.println(m.next(1));
        System.out.println(m.next(1));
        System.out.println(m.next(4));
    }
}
