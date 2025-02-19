import java.util.Scanner;
class Input_function
{
	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a string : ");
		String str=in.nextLine();
	    System.out.println("Enter a number : ");
		int num=in.nextInt();
		System.out.println("Enter a float : ");
		float integer=in.nextFloat();
		System.out.println("Enter a char : ");
		char letter=in.next().charAt(0);
		System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=in.nextInt();
		}
		
		System.out.println();
		System.out.println("Entered Inputs :");
		System.out.println(str);
		System.out.println(num);
		System.out.println(integer);
		System.out.println(letter);
		System.out.println("Array Elements : ");
		for(int i=0;i<size;i++)
		{
		    System.out.println(arr[i]);
		}
		
	}
}