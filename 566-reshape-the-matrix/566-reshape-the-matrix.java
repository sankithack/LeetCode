class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result;
        boolean flag = true;
        int m=mat.length,n=mat[0].length;
        if ( m==0 || r*c != m*n) {
            return mat;
        }else{
            result=new int[r][c];
        }        
        int cur_row = 0, cur_col = 0;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag) {
                    result[cur_row][cur_col] = mat[i][j];
                    cur_col++;
                    if (cur_col == c) {
                        cur_row++;
                        cur_col = 0;
                    }
                } 
            }
        }
        return result;
    }
}
