// i had an epiphany that this probelm is somewhat giving me vibes of the maximum subarray problem we have solved before
// lo and behold i even figured out a solution to this problem. since i know the maxium subarray problem can be solve in a linear pass 
// now i just ned to figure out if we can reduce the extra space by storing and processing the stock prices change deltas as we also solve the 
// maximum subarray problem.

class Solution{
    int rollingSum = 0;
    public int maxProfit(int[] prices){
        int maxProfit =0;
        for(int i = 1; i<prices.length; i++){
            maxProfit = maximumSubarray(prices[i]-prices[i-1],maxProfit);
        }
        return maxProfit;
    }

    int maximumSubarray(int delta, int maxProfit){
        rollingSum+=delta;
        if(rollingSum  > maxProfit){maxProfit = rollingSum; return maxProfit;}
        if(rollingSum  < 0){rollingSum = 0; }
        return maxProfit;
    }
}

