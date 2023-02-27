// Task 47 Write a custom java DBA Implementation to have insertion desig singly linked list of nodes chained and implement selectlonfert and display operation for the same

// Hint: Dynamic SLL IDSA Selection of Custom Node Oblect


public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void selectionSort() {
        Node current = head;
        while (current != null) {
            Node minNode = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (innerCurrent.data < minNode.data) {
                    minNode = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }
            int temp = current.data;
            current.data = minNode.data;
            minNode.data = temp;
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(2);
        list.insert(8);
        list.insert(1);
        System.out.print("Original List: ");
        list.display();
        list.selectionSort();
        System.out.print("Sorted List: ");
        list.display();
    }
}
