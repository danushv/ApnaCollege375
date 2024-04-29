public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n=A.length;
        int [] temp=new int [n];
        int []result=new int [2];
        int repeating=-1;
        int missing=-1;
        
        for(int i=0;i<n;i++)
        {
            temp[A[i]-1]++;
            if(temp[A[i]-1]>1)
            {
                repeating =A[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(temp[i]==0)
            missing=i+1;
        }
        result[1]=missing;
        result[0]=repeating;
        
        return result;
    }
}
