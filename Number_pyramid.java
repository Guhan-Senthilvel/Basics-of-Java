class Number_pyramid
{
	public static void main(String[] args)
	{
	    int i,j,k,l,n=5;
	    
	    //Program 1
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=i;j++)
		    {
		        System.out.print("1 ");
		    }
		    System.out.println();
		}
	
	    //Program 2
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=i;j++)
		    {
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}
	
	
	    //Program 3
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=i;j++)
		    {
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
		
		//Program 4
		int num=1;
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=i;j++)
		    {
		        System.out.print(num+ " ");
		        num++;
		    }
		    System.out.println();
		}
		
		
		//Program 5
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("1");
		    }
		    System.out.println();
		}
		
		
		//Program 6
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print("  ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("1 ");
		    }
		    System.out.println();
		}
		
		
		//Program 7
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("1 ");
		    }
		    System.out.println();
		}
		
		
		//Program 8
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		
		
		//Program 9
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("1");
		    }
		    for(l=1;l<i;l++)
		    {
		        System.out.print("1");
		    }
		    System.out.println();
		}
		
		
		
		//Program 10
		
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print(k);
		    }
		    for(l=i-1;l>0;l--)
		    {
		        System.out.print(l);
		    }
		    System.out.println();
		}
		
		
		//Program 11
	
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=(2*i-1);k++)
		    {
		        if(k==1 || k==(2*i-1) || i==n)
		        {
		        System.out.print("*");
		        }
		        else{
		            System.out.print("0");
		        }
		    }
		 
		    System.out.println();
		    
		}
		
		
		
		//Program 12
		
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print(k);
		    }
		    for(l=i-1;l>0;l--)
		    {
		        System.out.print(l);
		    }
		    System.out.println();
		}
		for(i=n-1;i>0;i--)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print(k);
		    }
		    for(l=i-1;l>0;l--)
		    {
		        System.out.print(l);
		    }
		    System.out.println();
		}
		
		
		
		//Program 13
		
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(i=n-1;i>0;i--)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	
		
		//Program 14
		
		for(i=1;i<=n;i++)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        if(k==1 || k==i){
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("0 ");
		        }
		    }
		    System.out.println();
		}
		for(i=n-1;i>0;i--)
		{
		    for(j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        if(k==1 || k==i){
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("0 ");
		        }
		    }
		    System.out.println();
		}
	}
}