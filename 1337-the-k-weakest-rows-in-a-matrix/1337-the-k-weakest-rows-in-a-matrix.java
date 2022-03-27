class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] row_count=new int[m][2];
        int count=0;
        for(int i=0;i<m;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1)
                    count++;
            }
            row_count[i][0]=i;
            row_count[i][1]=count;
        }
        Arrays.sort(row_count,new Comparator<int[]>(){
            @Override
            public int compare(int []a,int []b){
                return (a[1]-b[1]);
            }
        });
        int result[]=new int[k];
        for(int i=0;i<k;i++){
            result[i]=row_count[i][0];
        }
        return result;
        //Time Complexity - O(N^2)
        //Space Complexity - O(M+K)
    }
}