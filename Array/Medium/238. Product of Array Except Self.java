Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


class Solution {
    public int[] productExceptSelf(int[] nums) {

        // see the editorial video if you dont understand...........
        //1. Initialize an empty answer array 
    //     int n=nums.length;
    //     int []answer=new int [n];

    //     answer[0]=1;
    //     //answer would contain the product of all the numbers to the left of i;
    //     for(int i=1;i<n;i++)
    //     {
    //         answer[i]=answer[i-1]*nums[i-1];
    //     }
    //     int r=1;
    //     //The only change in this approach is that we don't explicitly build the R array from before.
    //     // Instead, we simply use a variable to keep track of the running product of elements to the right and we keep updating the answer array by doing answer[i]=answer[i]∗Ranswer[i] = answer[i] * Ranswer[i]=answer[i]∗R.
    //     // For a given index i, answer[i] contains the product of all the elements to the left and R would contain product of all the elements to the right. 
    //    // We then update R as R=R∗nums[i]R = R * nums[i]R=R∗nums[i]
    //     for(int i=n-1;i>=0;i--)
    //     {
    //         answer[i]=answer[i]*r;
    //         r=r*nums[i];
    //     }
        // return answer;
    
    int n= nums.length;
    int [] answer=new int[n];
    int []left=new int[n];
    int [] right=new int [n];
    left[0]=1;
    for(int i=1;i<n;i++)
    {
        left[i]=left[i-1]*nums[i-1];
    }
    right[n-1]=1;
    for(int i=n-2;i>=0;i--)
    {
        right[i]=right[i+1]*nums[i+1];
    }

    for(int i=0;i<n;i++)

    {
        answer[i]=right[i]*left[i];
    }
    return answer;
    }
}
