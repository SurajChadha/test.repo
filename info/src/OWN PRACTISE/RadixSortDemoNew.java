import java.util.Arrays;
public class RadixSortDemoNew {
   int getMax(int a[],int n) {
	   int max = a[0];
	   for(int i = 1;i<n;i++) {
		   if(a[i]>max)
			   max = a[i];
	   }
	   return max;//maximum element from max
   }
   void countingSort(int a[],int n,int place)//function
   {
	   int[] output = new int[n+1];
	   int[] count = new int[10];
	   
	   //calculate count of elements
	   for(int i=0;i<n;i++)
		   count[(a[i]/place)%10]++;
	   
	   //calculate cumulative frequency
	   for(int i = 1;i < 10; i++)
		   count[i] += count[i-1];
	   
	   //Place the elements in sorted order
	   for(int i=n-1;i>=0;i--)
	   {
		   output[count[(a[i]/place)%10]-1]=a[i];
		   count[(a[i]/place)%10]--;
	   }
	   for(int i=0;i<n;i++)
	   a[i] = output[i];
   }
   void radixso
}
