class KthLargest {
    private PriorityQueue<Integer> maxHeap;
    private static int kthLargest;
    public KthLargest(int k, int[] nums) {
        maxHeap=new PriorityQueue<>();
        this.kthLargest=k;
        for(int i:nums)
            maxHeap.offer(i);
        
        while(maxHeap.size() > kthLargest){
            maxHeap.poll();
        }
    }
    
    public int add(int val) {
        maxHeap.offer(val);
        if(maxHeap.size()> kthLargest){
            maxHeap.poll();
        }
        
        return maxHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */