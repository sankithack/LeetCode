class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> curr_row = new ArrayList();
        curr_row.add(1);
        result.add(curr_row);
        if (numRows == 1) return result;
        for (int i = 1; i < numRows; i++) {
            curr_row = new ArrayList();
            curr_row.add(1);
            int k=0;
            for(int j=i;j<=2*i-2;j++){
                curr_row.add(result.get(i-1).get(k)+result.get(i-1).get(k+1));
                k++;
            }
            curr_row.add(1);
            result.add(curr_row);
        }
        return result;
    }
}
