// Write a java DSA application to create doubly linked list for account details as bean class node with id,bal,name and they are linked together now you have to perform sorting/searching operations and display them.

// Hint: Dynamic DSA DLL

// Rules: Sorting/Searching

// Account

// id-10

// bal-10000

// name-ram

// (Bean class in node data)




// 4 / 4

// Continuing from the previous implementation, here is an updated version that includes searching operations and a sample main method to test the functionality:

// java
// Copy code
import java.util.Scanner;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        // Adding accounts to the list
        list.add(new Account(3, 5000, "Alice"));
        list.add(new Account(1, 10000, "Bob"));
        list.add(new Account(2, 7000, "Charlie"));
        list.add(new Account(4, 3000, "Dave"));

        // Sorting the list by id
        list.sortById();

        // Displaying the sorted list
        System.out.println("Sorted by id:");
        list.display();

        // Sorting the list by balance
        list.sortByBalance();

        // Displaying the sorted list
        System.out.println("Sorted by balance:");
        list.display();

        // Searching for an account by id
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an account id to search for: ");
        int id = scanner.nextInt();
        Node foundNode = list.searchById(id);
        if (foundNode != null) {
            System.out.println("Found account: " + foundNode.getData().getName() + " with balance " + foundNode.getData().getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

public class Account {
    private int id;
    private int balance;
    private String name;
    
    public Account(int id, int balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    // Getters and Setters for id, balance, and name
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Node {
    private Account data;
    private Node prev;
    private Node next;

    public Node(Account data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    // Getters and Setters for data, prev, and next
    
    public Account getData() {
        return data;
    }

    public void setData(Account data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    



    

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Account data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public void sortById() {
        Node current = head;
        Node index = null;
        Account temp;

        if (isEmpty()) {
            return;
        } else {
            while (current != null) {
                index = current.getNext();
                while (index != null) {
                    if (current.getData().getId() > index.getData().getId()) {
                        temp = current.getData();
                        current.setData(index.getData());
                        index.setData(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }

    public void sortByBalance() {
        Node current = head;
        Node index = null;
        Account temp;

        if (isEmpty()) {
            return;
        } else {
            while (current != null) {
                index = current.getNext();
                while (index != null) {
                    if (current.getData().getBalance() > index.getData().getBalance()) {
                        temp = current.getData();
                        current.setData(index.getData());
                        index.setData(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }

    public Node searchById(int id) {
        Node current = head;
        while (current != null) {
            if (current.getData().getId() == id) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println("Account id: " + current.getData().getId() + ", balance: " + current.getData().getBalance() + ", name: " + current.getData().getName());
            current = current.getNext();
        }
    }
}







public void setNext(DoublyLinkedListDemo.Node newNode) {
}
}
}
