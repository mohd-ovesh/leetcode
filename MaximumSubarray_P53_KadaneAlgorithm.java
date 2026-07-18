class Solution{
    public int maxSubArray(int[] nums){
        int maximumSum= nums[0];
        int startIndex = 0;
        int endIndex = 0;
        int currentStart = 0;
        int rollingSum = 0;
        for(int i = 0; i<nums.length; i++){
            rollingSum = rollingSum + nums[i];

            if(rollingSum > maximumSum){
                maximumSum = rollingSum;
                endIndex = i;
                startIndex = currentStart;
            }
 
            if(rollingSum < 0){
                currentStart = i+1;
                rollingSum = 0;
            }

       }
        return maximumSum;
    }
}

