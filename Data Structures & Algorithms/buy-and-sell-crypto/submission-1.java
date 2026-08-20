class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int min=prices[0];
        for(int i:prices){
            min=Math.min(i,min);
            maxp=Math.max(maxp,i-min);
        }
        return maxp;
    }
}
