//Task 46:-write a java dsa program to implement inputs of elements in array process
//using selection sorting and display showing the pos of smallest in each phase
package SearchSort;

public class SelectionSort {
  void selection(int a[])
  {
	  int i,j,small;
	  int n = a.length;
	  for(i=0;i<n-1;i++)
	  {
		  small = i;
		  for(j=i+1;j<n;i++)
		  {
			  if(a[j]<a[small])
			  {
				  if(a[j]<a[small])
                        small=j;
			  }
			  int temp = a[small];
			  a[small]=a[i];
			  a[i]=temp;
		  }
	  }
	  }
	  void printArray(int a[])
	  {
		  int i;
		  int n=a.length;
		  for(i=0;i<n;i++)
			  System.out.print(a[i]+"");
		  
	  }
	  public static void main(String[] args)
	  {
		  int a[]= {91,49,4,19,10,21};
		  SelectionSort i1=new SelectionSort();
		  System.out.println("\nBefore sorting array elements are-");
		  i1.printArray(a);
		  i1.selection(a);
		  System.out.println("After sorting array elements are-");
		  i1.printArray(a);
		  System.out.println();
	  }
  
}
