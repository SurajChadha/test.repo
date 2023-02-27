public class ArrayPQ {

    private int[] arr;
    private int size;

    public ArrayPQ(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void enqueue(int val) {
        if (size == arr.length) {
            throw new IllegalStateException("Queue is full");
        }
        arr[size++] = val;
        swim(size - 1);
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int max = arr[0];
        swap(0, --size);
        sink(0);
        return max;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[0];
    }

    private void swim(int index) {
        while (index > 0 && arr[index] > arr[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void sink(int index) {
        while (leftChild(index) < size) {
            int child = leftChild(index);
            if (child + 1 < size && arr[child] < arr[child + 1]) {
                child++;
            }
            if (arr[index] >= arr[child]) {
                break;
            }
            swap(index, child);
            index = child;
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }
}

