class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Using HashMap as we have to return Index
        HashMap<Integer,Integer> map=new HashMap();
        int element=0;
        for(int i=0;i<nums.length;i++){
            element=target-nums[i];
            if(map.containsKey(element)){
                return new int[]{map.get(element),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
        
    }
}