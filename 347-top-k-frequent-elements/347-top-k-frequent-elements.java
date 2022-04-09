class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // O(1) time
        if(k== nums.length)
            return nums;
        
        int[] result=new int[k];
        HashMap<Integer,Integer> map=new HashMap();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> minheap=new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
                return map.get(a)-map.get(b);
            }
        });
        for(int n:map.keySet()){
            minheap.add(n);
            if(minheap.size()>k)minheap.poll();
        }
        
        for(int i=k-1;i>=0;i--){
            result[i]=minheap.poll();
        }
        return result;
        // Time Complexity - O(nlog n)
        // Space Complexity - O(n)
    }
}