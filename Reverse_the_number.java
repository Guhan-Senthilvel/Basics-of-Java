class Reverse_the_number
{
	public static void main(String[] args) 
	{
	    int r,n=123456,rev=0,count=0;
	    while(n>0)
	    {
	        
	       r=n%10;
	       n=n/10;
	       rev=rev*10+r;
	       count++;
	    }
	    System.out.println("Reversed Number : " + rev);
	    System.out.println("No.of digits : " + count);
	    
    
	}
}