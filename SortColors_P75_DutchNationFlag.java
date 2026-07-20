// Dutch national flag algorithm for 3 or less doesn't work for more than 3, most eficient way
class Solution{
    public void sortColors(int[] nums){
       int current = 0;
       int low = 0;
       int high = nums.length -1;

       while(current <= high){
            if(nums[current] == 0){
                swap(nums,current,low);
                current++;
                low++;
                continue;
            }

            if(nums[current] == 2){
                swap(nums,current,high);
                // don't increase the current yet. what if after the swap we got a zero that need to be further swapped before we move forward
                high--;
                continue;
            }

            current+=1;
       }
    }

    void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}

