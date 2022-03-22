class Solution {
    public int maxArea(int[] height) {
        //using two pointer approach
        int l=0,r=height.length-1;
        int currArea=0;
        int maxArea=0;
        while(l<r){
            currArea=(r-l)*Math.min(height[l],height[r]);
            maxArea=Math.max(currArea,maxArea);
            if(height[l]>height[r])
                r--;
            else
                l++;
        }
        return maxArea;
    }
}