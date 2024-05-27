class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here.sort()
        boolean result=true;
        
        Arrays.sort(a);
        Long []blong=Arrays.stream(b).boxed().toArray(Long[]::new);
        Arrays.sort(blong,Collections.reverseOrder());
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]+blong[i]<k)
            {
                result=false;
            }
        }
        return result;
    }
}
