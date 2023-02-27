package dataStructures;

public class CircularDemoArr {
  int Queue[];
  int front,rear;
  int maxsize;
  
  public CircularDemoArr(int s) {
	  maxsize=s;
	  Queue=new int[maxsize];
	  front=rear=-1;
  }
  public void delete()
  {
	  if(front== -1)
	  {
		  System.out.println("Underflow");
		  return;
	  }
	  else if(front==rear)
	  {
		  front=-1;
		  rear=-1;
	  }
	  else if(front==maxsize-1)
		  front=0;
	  else
		  front=front+1;
  }
  public void insert(int data)
  {
	  if((rear+1)%maxsize==front)
	  {
		  System.out.println("Overflow");
		  return;
	  }
	  else if(front==-1 && rear==-1)
	  {
		  front=0;
		  rear=0;
	  }
	  else if(rear==maxsize-1 && front!=0)
	  {
		  rear=0;
	  }
	  else
		  rear=rear+1;
	  Queue[rear]=data;
  }
  public void display()
  {
	  for(int i=front; i<=rear; i++)
		  System.out.println(Queue[i]+" ");
	  for(int i=rear;i<=front;i++)
		  System.out.println(Queue[i]+" ");
  }
  public static void main(String[] args) {
	  CircularDemoArr cir=new CircularDemoArr(5);
		cir.insert(10);cir.insert(20);cir.insert(30);
		cir.insert(40);cir.insert(50);
		cir.display();
		
		cir.delete();
		cir.display();
		
		cir.insert(60);
		cir.display();
		
		cir.insert(90);
		cir.delete();
		cir.display();
}
}
