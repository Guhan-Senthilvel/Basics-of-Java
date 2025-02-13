class Armstrong_number
{
	public static void main(String[] args)
	{
		int sum=0,r,a=370,b=a;
		int count=0;
		while(a>0)
		{
		    r=a%10;
		    a=a/10;
		    count++;
		    
		    sum=sum+(r*r*r);
		    
		   
		}
		System.out.println("Digits: " + count);
		System.out.println("Sum of cube of each digits: " + sum);
	    if(sum==b)
	    {
	        System.out.println("Given number is an armstrong number");
	    }
	    else
	    {
	        System.out.println("Given number is not an armstrong number");
	    }
	    
	    
	}
	
}