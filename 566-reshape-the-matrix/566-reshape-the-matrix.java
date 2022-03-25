class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        if ( m==0 || r*c != m*n) {
            return mat;
        }
        int[][] result=new int[r][c];     
        int cur_row = 0, cur_col = 0;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                    result[cur_row][cur_col] = mat[i][j];
                    cur_col++;
                    if (cur_col == c) {
                        cur_row++;
                        cur_col = 0;
                    }
            }
        }
        return result;
        //Time Complexity - O(N^2)
        //Space Complexity - O(1)
    }
}
