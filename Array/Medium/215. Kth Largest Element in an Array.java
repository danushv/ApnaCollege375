class Solution {
    public int findKthLargest(int[] nums, int k) {

        // there is something called as minheap which will help you do that 
        // kicks out smallest element 

        // priority queue uses minheap by default;

        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for (int num:nums)
        {
            heap.add(num);

            if(heap.size()>k)
            heap.remove();
        }


        return heap.peek();
        
    }
}
