class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int currSum=0;

        for(int i=0;i<n;i++)
        {
            currSum=Math.max(currSum,0)+nums[i];
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
