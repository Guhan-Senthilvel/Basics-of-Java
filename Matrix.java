import java.util.Scanner;
class Matrix
{
	public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of rows : ");
		int row=in.nextInt();
	    System.out.println("Enter number of columns : ");
		int col=in.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        System.out.println("Enter an element in row " + (i+1) + " and column " +(j+1) + " : "); 
		        arr[i][j]=in.nextInt();
		    }
		}
		System.out.println("The matrix is : ");
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        System.out.print(arr[i][j] + " "); 
		    }
		    System.out.println();
		}
	
	}
}