
class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int []dp=new int [n+1];
        dp[0]=0;
        dp[1]=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            dp[i+1]=Math.max(dp[i],dp[i-1]+arr[i]);
        }
        return dp[n];
    }
}
