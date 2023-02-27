package dyna;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.el.parser.Node;
public class LinearSearch2 {
	
	class DoublyLinkedList {
	    Node head;
	    Node tail;

	    public void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }

	    public String toString() {
	        String result = "";
	        Node current = head;
	        while (current != null) {
	            result += current.data + " ";
	            current = current.next;
	        }
	        return result;
	    }
	}


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] arr = { 2, 7, 5, 3, 9, 4 };
	        DoublyLinkedList list = new DoublyLinkedList();
	        list.add(2);
	        list.add(7);
	        list.add(5);
	        list.add(3);
	        list.add(9);
	        list.add(4);

	        System.out.println("Array: " + Arrays.toString(arr));
	        System.out.print("Enter a number to search: ");
	        int searchNum = sc.nextInt();

	        int index = linearSearchArray(arr, searchNum);
	        if (index == -1) {
	            System.out.println("Number not found in array.");
	        } else {
	            System.out.println("Number found at index " + index + " in array.");
	        }

	        System.out.println("Linked List: " + list.toString());
	        System.out.print("Enter a number to search: ");
	        searchNum = sc.nextInt();

	        index = linearSearchLinkedList(list, searchNum);
	        if (index == -1) {
	            System.out.println("Number not found in linked list.");
	        } else {
	            System.out.println("Number found at index " + index + " in linked list.");
	        }
	    }

	    public static int linearSearchArray(int[] arr, int searchNum) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == searchNum) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static int linearSearchLinkedList(DoublyLinkedList list, int searchNum) {
	        Node current = list.head;
	        int index = 0;
	        while (current != null) {
	            if (current.data == searchNum) {
	                return index;
	            }
	            current = current.next;
	            index++;
	        }
	        return -1;
	    
	    
	    
	}
}
	


	
