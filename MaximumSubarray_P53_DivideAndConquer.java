class Solution{
    public int maxSubArray(int[] nums){
        int maxSubArraySum = helper(nums,0,nums.length-1);
        return maxSubArraySum;
    }

    private int helper(int[] nums, int start, int end){
       if(start == end){return nums[start];}
       int mid = start + (end-start)/2;      
       int maxLeft = helper(nums, start, mid); 
       int maxRight = helper(nums, mid+1, end);
       int leftMiddle = 0;
       int leftGreatest = Integer.MIN_VALUE; 
       int rightMiddle= 0;
       int rightGreatest =  Integer.MIN_VALUE;
       for(int i = mid; i>= start;i--){
             leftMiddle = leftMiddle+nums[i];
             if(leftMiddle > leftGreatest){
             leftGreatest = leftMiddle;
             }
       }
       for(int j = mid+1; j<= end; j++){
            rightMiddle = rightMiddle+nums[j];
            if(rightMiddle>rightGreatest){
                rightGreatest = rightMiddle;
            }
       }
       int crossMiddle = leftGreatest + rightGreatest ;
       return maxOfThree(maxLeft,maxRight,crossMiddle);
    }

    private int maxOfThree(int i, int j, int k){
        if(i>=j && i>=k) return i;
        else if(j>=i && j>=k) return j;
        else return k;
    }
}
