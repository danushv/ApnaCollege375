//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //coint de here
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<N;i++)
        {
            min=Math.min(min,A[i]);
            max=Math.max(max,A[i]);
        }
        return min+max;
    }
}
