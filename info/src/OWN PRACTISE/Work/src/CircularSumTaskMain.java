

import java.util.*;
public class CircularSumTaskMain {
	static class Node{
		int data;
		Node next;
	};
	static Node push(Node head_ref, int data)
	{
		Node ptr1=new Node();
		Node temp=head_ref;
		if(head_ref!=null)
		{
			while(temp.next != head_ref)
				temp=temp.next;
			temp.next=ptr1;
		}
		else
	ptr1.next=ptr1;
	head_ref=ptr1;
	return head_ref;
	}
	static int sumOfList(Node head)
	{
		Node temp=head;
		int sum=0;
		if(head!=null)
		{
			do {
				temp=temp.next;
				sum+=temp.data;
			}
			while(temp!=head);
		}
		return sum;
	}
	public static void main(String[] args) {
		Node head=null;
		head=push(head, 12);
		head=push(head, 56);
		head=push(head, 2);
		head=push(head, 11);
		System.out.println("Sum of Circular linked" + "list is= " + sumOfList(head)); 
	}

}
