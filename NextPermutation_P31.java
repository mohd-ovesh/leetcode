class Solution{
    public void nextPermutation(int[] nums){
       int swapHolder;
       int minimumGreatest= 0;
       int minimumGreatestIndex= 0;
       int size = nums.length;
       for(int i =1;i<size;i++){
            if(nums[size-(i+1)]<nums[size-i]){
                swapHolder = nums[size-(i+1)];
                minimumGreatest = nums[size-i];
                for(int j = size-i; j<size;j++){
                    if(nums[j] <= minimumGreatest && nums[j]>swapHolder){ 
                        minimumGreatest = nums[j];
                        minimumGreatestIndex = j;
                    }
                }
                nums[size-(i+1)] = minimumGreatest;
                nums[minimumGreatestIndex] = swapHolder;
                
                for(int j = size-i,k=0; j< size-i + (int)i/2;j++,k++){
                    swapHolder = nums[j];
                    nums[j] = nums[size-(k+1)];
                    nums[size-(k+1)] = swapHolder;
                }
                return;
            }

       }

            for(int i = 0; i<(int)size/2; i++){
                swapHolder = nums[i];
                nums[i] = nums[size-(i+1)];
                nums[size-(i+1)] = swapHolder;
            }
       
    }
}
