class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i:stones){
            maxHeap.add(i);
        }
        int a,b,c;
        while(maxHeap.size()>1){
            a=maxHeap.poll();
            b=maxHeap.poll();
            c=a-b;
            if(c==0)
                continue;
            maxHeap.add(c);
        }
        if(maxHeap.isEmpty())
            return 0;
        return maxHeap.poll();
        // Time Complexity - O(nlogn)
        // Space Complexity - O(n)
    }
}