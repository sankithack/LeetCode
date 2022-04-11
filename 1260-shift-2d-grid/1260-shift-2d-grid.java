class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        while(k > 0){
            int[][] newGrid = new int[grid.length][grid[0].length];
            
            // Case #1: Move everything not in the last column.
            for(int r=0;r<grid.length;r++){
                for(int c=0;c< grid[0].length-1;c++)
                    newGrid[r][c+1]=grid[r][c];
            }
            
            // Case #2: Move everything in last column, but not last row.
            for(int r=0;r<grid.length-1;r++)
                newGrid[r+1][0]= grid[r][grid[0].length-1];
            
            // Case #3: Move the bottom right.
            newGrid[0][0] = grid[grid.length-1][grid[0].length - 1];
                
            grid = newGrid;
            k--;
            
        }
        List<List<Integer>> result= new ArrayList<>();
        for(int [] row:grid){
            List<Integer> listRow = new ArrayList<>();
            for(int v:row) listRow.add(v);
            result.add(listRow);
        }
        
        return result;
    }
    // Time Complexity - O(n.m.k)
    // Space Complexity - O(n.m)
}