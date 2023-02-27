package dataStructures;
public class CircularLinkedListDeletion
{
static class Node
	  {
		  int data;
		  Node next;
	  };
static Node push(Node head_ref,int data)
{
	Node ptr1 = new Node();
	ptr1.data = data;
	ptr1.next = head_ref;
	
	if(head_ref != null) {
		Node temp = head_ref;
		while(temp.next != head_ref)
			temp = temp.next;
		temp.next = ptr1;
	}
	else
		ptr1.next = ptr1;
	
	head_ref = ptr1;
	return head_ref;
}
}
