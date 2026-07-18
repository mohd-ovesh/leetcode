//This solution is intuitive but got time limit exceeded i need O(n) solution to do this efficiently

class Solution{
    public int maxSubArray(int[] nums){
        int sum;
        int pivot;
        int endOfSubarray;
        int maximumSum = nums[0];
        // lets cycle through pivots

        for(int i = 0; i<nums.length ; i++){
             sum = 0;
            for(int j = i; j<nums.length; j++){
                sum = sum+nums[j];
                if(sum > maximumSum){
                    pivot = i;
                    endOfSubarray = j;
                    maximumSum = sum;
                }
            }
        }

        // after cycling through all pivots and checking the sum of all possible subarrays now it looks like O(n^2)
        // but the total number of subsets possible is 2^n -1 using my maths set theory knowledge right.

        return maximumSum;
    }
}

