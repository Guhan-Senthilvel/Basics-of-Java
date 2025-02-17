class Element_count
{
    public static void main(String[] args)
    {
        int arr[]={3,2,3,3,1,9,2};
        
        
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                    count++;
                }
            }
            if(arr[i]!=0){
                System.out.print("Element : " + arr[i]);
                System.out.print(" Count : " + count);
                System.out.println();
            }
        }
        
       
    }
    
}    