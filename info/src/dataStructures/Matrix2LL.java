package dataStructures;

public class Matrix2LL {
  class Node
  {
	  int data;
	  Node right, down;
	  
	  //Default Constructor
	  Node()
	  {
		  this.right = null;
		  this.down = null;
		  
	  }
	  Node(int d)
	  {
		  this.data = d;
		  this.right = null;
		  this.down = null;
	  }
  }
  Node constructLinkedMatrix(int [][] arr,int m,int n)
  {
	  Node mainHead = null;
	  Node[] head = new Node[m];
	  Node rightTemp = new Node(), newptr;
	  for(int i=0;i<m;i++)
	  {
		  head[i] = null;
		  for(int j=0;j<n;j++)
		  {
			  newptr = new Node(arr[i][j]);
 			  if(mainHead == null)
				  mainHead = newptr;
			  if(head[i] == null)
				  head[i] = newptr;
			  else
				  rightTemp.right = newptr;
			  rightTemp = newptr;
		  }
	  }
	  for(int i=0;i<m-1;i++)
	  {
		  Node temp1 = head[i],temp2 = head[i+1];
		  while(temp1 != null && temp2 != null)
		  {
			  temp1.down = temp2;
			  temp1 = temp1.right;
			  temp2 = temp2.right;
			  
		  }
	  }
	  return mainHead;
			  
  }
  void display(Node head)
  {
	  Node rp, dp = head;
	  while(dp != null)
	  {
		  rp=dp;
		  while(rp != null)
		  {
			  System.out.println(rp.data + " ");
			  rp = rp.right;
		  }
		  System.out.println();
		  dp = dp.down;
	  }
  }
  public static void main(String[] args) {
	Matrix2LL obj = new Matrix2LL();
	int m = 3,n = 3;
	
	//2-D Matrix
	int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	Node head = obj.constructLinkedMatrix(arr,m,n);
	obj.display(head);
}
}
