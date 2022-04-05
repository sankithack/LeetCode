class Solution {
    public int singleNumber(int[] nums) {
        //Using Bitwise XOR Property 
        int result=0;
        for(int num:nums)
            result^=num;
        return result; 
        //Time Complexity - O(N)
        //Space Complexity - O(1)
    }
}