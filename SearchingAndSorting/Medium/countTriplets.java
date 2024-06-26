class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        long ans=0;
        Arrays.sort(arr);
        
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k]>=sum)
                {
                    k--;
                }
                else
                {
                    ans=ans+(k-j);
                    j++;
                }
            }
        }
        return ans;
    }
}
