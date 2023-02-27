class LinkedList {
    Node head;
    Node tail;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node tailPrevious() {
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        return current;
    }

    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void insertionSort() {
        Node current = head;
        Node current2;

        while (current.next != null) {
            Node min_value = current;
            current2 = current.next;
            while (current2 != null) {
                if (min_value.data > current2.data) {
                    min_value = current2;
                }
                current2 = current2.next;
            }
            int temp = current.data;
            current.data = min_value.data;
            min_value.data = temp;
            current = current.next;
        }
    }
}

public class Sorting {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(78);
        ll.insert(45);
        ll.insert(12);
        ll.insert(34);
        ll.insert(53);
        ll.show();
        ll.insertionSort();
        ll.show();
    }
}
