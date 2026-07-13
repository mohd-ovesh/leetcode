import java.util.HashMap;
class Solution{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
           if(nums[i]*2 != target){
            map.put(nums[i],i); 
           } 
           else if(!map.containsKey(nums[i])) map.put(nums[i],i); 
           else return new int[]{i,map.get(nums[i])};
           if( map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i){
            return new int[]{i,map.get(target-nums[i])};
           }
        }
    return new int[]{-1,-1};
    }
}
