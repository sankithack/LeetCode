class Solution {
    public int findDuplicate(int[] nums) {
        //Using Hashset approach
        Set<Integer> seen=new HashSet();
        for(int i:nums){
            if(seen.contains(i))
                return i;
            seen.add(i);
        }   
        return -1;
        //Time Complexity - O(N)
        //Space Compexity - O(N)
    }
}