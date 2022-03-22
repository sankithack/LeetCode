class Solution {
    public int maxSubArray(int[] nums) {
        //Using Kadane's Algorithm
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i:nums){
            currsum+=i;
            maxsum=Math.max(currsum,maxsum);
            if(currsum<0)
                currsum=0;
        }
        return maxsum;
    }
}