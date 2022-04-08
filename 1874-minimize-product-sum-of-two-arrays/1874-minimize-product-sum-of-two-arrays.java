class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
        //Using Max Heap Approach
        //Sort the nums1 Array
        Arrays.sort(nums1);
        
        //Creating Max Heap and add nums2 Array elements
        PriorityQueue<Integer> pQueue=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums2)
            pQueue.add(i);
        
        // Result
        int ans=0;
        
        //Multiplying the Elements from num1 and num2
        for(int i=0;i<nums1.length;i++){
            ans+=nums1[i]*pQueue.poll();
        }
        
        return ans;
        // Time Compexity - O(nlogn)
        // Space Compexity - O(N)
    }
}