class Swap_number
{
	public static void main(String[] args)
	{
	    int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,0};
	    int count=0;
	    int prev=0;
	    int temp;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==0)
	        {
	            temp=arr[i];
	            int j=i+1;
	            while(j<arr.length)
	            {
	                if(arr[j]!=0)
	                {
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                    break;
	                }
	                else
	                    j++;
	            }
	        }
	    }
	    for(int i:arr)
	    {
	        System.out.print(i);
	    }
	}
}
	        