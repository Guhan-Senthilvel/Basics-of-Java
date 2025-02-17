class max
{
	public static void main(String[] args) 
	{
	    int arr[]={7,4,2,3,1};
	    int max1=0,max2=0,max3=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]>max1)
	            max1=arr[i];
	 
	    }
	    System.out.println(max1);
		for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]>max2 && arr[i]<max1)
	            max2=arr[i];
	  
	    }
	    System.out.println(max2);
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]>max3 && arr[i]<max2)
	            max3=arr[i];
	    }
	    System.out.println(max3);
	  
	}
}