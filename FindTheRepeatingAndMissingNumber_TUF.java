class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int[] buckets = new int[n+1]; // for index convenience and readabily
        int k = 0; // doesn't interfere with the [1,n] range for repeating element
        int m = 0; // for missing element
        int[] returnArray = new int[2];
        for(int i= 0;i<n;i++){
            buckets[nums[i]]++;
        }

        for(int j =1; j<=n;j++){
            if(buckets[j] == 2){
                returnArray[0] = j;
            }
            if(buckets[j] == 0){
                returnArray[1] = j;
            }
        }

        return returnArray;
    }
}

