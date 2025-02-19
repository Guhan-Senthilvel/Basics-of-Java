import java.util.Scanner;
class Sorted_matrix
{
    public static void main(String[] args) {
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
        System.out.println("The unsorted matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The sorted matrix is");
        int temp,init,curr;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               init=arr[i][j];
               for(int k=i;k<row;k++)
               {
                for(int f=j;f<col;f++) 
                {
                   curr=arr[k][f];
                   if(init>curr) 
                   {
                    temp=arr[i][j];
                    arr[i][j]=arr[k][f];
                    arr[k][f]=temp;
                    init=arr[i][j];
                   }
                }
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