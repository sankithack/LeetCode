class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minprice= Integer.MAX_VALUE;
        for(int i:prices){
            if(i<minprice)
                minprice=i;
            else if(i - minprice > maxprofit)
                maxprofit = i-minprice;
        }
        return maxprofit;
    }
}