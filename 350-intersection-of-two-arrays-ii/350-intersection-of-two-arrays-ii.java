class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int k=0;
        for(int i:nums2){
            int cnt=map.getOrDefault(i,0);
            if(cnt>0){
                nums1[k++]=i;
                map.put(i,cnt-1);
            }
        }
        return Arrays.copyOfRange(nums1,0,k);        
    }
}