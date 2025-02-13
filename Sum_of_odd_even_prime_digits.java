class Sum_of_odd_even_prime_digits
{
	public static void main(String[] args)
	{
		int i,r,a=123456;
		int b=0;
		int c=0;
		int d=0;
		while(a>0)
		{
		    r=a%10;
		    a=a/10;
		    if(r%2==0)
		    {
		        b=b+r;
	    	}
	    	else if(r%2==1)
	    	{
	    	    c=c+r;
	    	}
		    if (r > 1)
		    {
                boolean prime=true;
                for(i=2;i<r;i++) 
                { 
                    if(r%i==0)
                    {
                        prime=false;
                        break;
                    }
                }
                if(prime){
                    d=d+r;
                }
		    }
		    
	    	
		}
	
		System.out.println("Sum of even numbers : " + b);
		System.out.println("Sum of odd numbers : " + c);
		System.out.println("Sum of prime numbers : " + d);
	}
	
	
}