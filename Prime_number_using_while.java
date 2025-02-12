class Prime_number_using_while
{
	public static void main(String[] args)
	{
	    int i=2,count=0,x=2;
	    if (x==0 || x==1)
	    {
	        System.out.println("NOT PRIME");
	    }
	    else if (x>1)
	    {
	        while(i<=x)
	        {
	            if(x%i==0 && count<2)
	            {
	                count++;
	            }
	            i++;
	        }
	        if(count>1)
	        {
	            System.out.println("NOT PRIME");
	        }  
	        else
	        {
	            System.out.println("PRIME");
	        }
	    }
	    else
	    {
	        System.out.println("NOT PRIME");
	    }
	}
}