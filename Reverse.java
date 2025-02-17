class Reverse
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=3;
        
        int j=1;
        
        int len=arr.length;
        int a=len/n;
        while(j<=a)
        {
            int k=n*(j-1);
            for(int i=j*n-1;i>=k;i--)
            {
                System.out.print(arr[i]);
            }
            j++;
        }
    }
}