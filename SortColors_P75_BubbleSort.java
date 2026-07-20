class Solution{
    public void sortColors(int[] nums){
        int size = nums.length;
        for(int j = 0; j<size;j++){
            for(int i = 1; i<size;i++){
                    if(nums[i]<nums[i-1]) swap(nums, i,i-1);
            }
        }

     }
        void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
        }

}
