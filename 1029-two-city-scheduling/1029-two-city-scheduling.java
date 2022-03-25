class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int mincost=0;
        Arrays.sort(costs,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int [] b){
                return (a[0]-a[1])-(b[0]-b[1]);
            }
        });
        int n=costs.length/2;
        for(int i=0;i<n;i++){
            mincost+= costs[i][0]+costs[i+n][1];
        }
        return mincost;
        
    }
}