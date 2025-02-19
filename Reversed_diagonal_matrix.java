import java.util.Scanner;
class Reversed_diagonal_matrix
{
    public static void main(String[] args) 
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter number of Rows:");
        int row=a.nextInt();
        System.out.println("Enter number of Columns:");
        int col=a.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter an element in row "+(i+1)+" and column "+(j+1));
                arr[i][j]=a.nextInt();
            }
        }
        System.out.println("The matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The reversed diagonal in matrix is");
        int temp;
        for(int i=0;i<row/2;i++)
        {
            for(int j=0;j<col;j++)
            {
                
               if(i==j) {
                temp=arr[i][j];
                arr[i][j]=arr[(row-1)-i][(col-1)-j];
                arr[(row-1)-i][(col-1)-j]=temp;
               }
            
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}