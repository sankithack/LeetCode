class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];
        
        for(int i=0;i<n;i++){
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                char ch=board[i][j];
                // Check if the position is filled with number
                if(ch!='.'){
                    
                    // Check the row
                    if(rows[i].contains(ch))
                        return false;
                    rows[i].add(ch);
                    
                    // Check the column
                    if(cols[j].contains(ch))
                        return false;
                    cols[j].add(ch);
                    
                    // Check the Box
                    int curr_box= ((i/3)*3)+(j/3);
                    if(boxes[curr_box].contains(ch)){
                        return false;
                    }
                    boxes[curr_box].add(ch);
                }
            }
        }
        return true;      
        // Time Compexity - O(N^2)
        // Space Complexity - O(N)
    }
}