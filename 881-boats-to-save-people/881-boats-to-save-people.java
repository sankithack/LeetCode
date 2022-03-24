class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //Using Greedy Approach - Two Pointer
        Arrays.sort(people);
        int boat=0;
        int l=0,r=people.length-1;
        while(l<=r){
            boat++;
            if(people[l] + people[r]<=limit)
                l++;
            r--;
        }
        
        return boat;
        
    }
}