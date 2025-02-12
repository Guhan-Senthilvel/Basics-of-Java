class Prime_number_using_for
{
	public static void main(String[] args)
	{
	    int i,count=0,x=2048;
	    if (x==0 || x==1)
	    {
	        System.out.println("NOT PRIME");
	    }
	    else if (x>1)
	    {
	        for(i=2;i<=x;i++)
	        {
	            if(x%i==0 && count<2)
	            {
	                count++;
	            }
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