// this solution is O(n^2) clearly so it got time limit exceeded for max number of input 10^5 approx 
// lesson is if we see 10^5 well we can't solve it efficiently by such a naive bruteforce right.
class Solution{
    public int maxProfit(int[] prices){
        int maxProfit=0;
        for(int i =0;i<prices.length-1;i++){
            for(int j=i+1; j<prices.length;j++){
                if(prices[j]-prices[i] > maxProfit){ maxProfit = prices[j]-prices[i]; }
            }
        }
        return maxProfit;
    }
}
