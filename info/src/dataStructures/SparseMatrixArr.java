package dataStructures;

public class SparseMatrixArr {
  public static void main(String[] args) {
	int sparse_matrix[][] = {
		{0,0,6,0,9},
		{0,0,4,6,0},
		{0,0,0,0,0},
		{0,1,2,0,0}
};
//size of matrix[][] = 
int size = 0;
for(int i=0; i<4; i++)
{
	for(int j=0;j<5;j++)
	{
		if(sparse_matrix[i][j]!=0)
		{
			size++;
		}
	}
}
System.out.println("size:"+size);
//defining final matrix
int matrix[][]=new int[3][size];
int k=0;
//computing final matrix
for(int i=0; i<4; i++)
{
	for(int j=0; j<5; j++)
	{
		if(sparse_matrix[i][j]!=0)
		{
			matrix[0][k] = i;
			matrix[1][k] = j;
			matrix[2][k]=sparse_matrix[i][j];
			k++;
			
		}
	}
}
for(int i=0; i<3; i++)
{
	for(int j=0; j<size; j++)
	{
		System.out.printf("%d",matrix[i][j]);
		System.out.printf("\t");
	}
	System.out.println();
}
  }}


