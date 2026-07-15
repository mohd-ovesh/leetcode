import java.util.HashMap;
import java.util.ArrayList;

class Solution{
    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] topKFrequent(int[] nums, int k){
       ArrayList<ArrayList<Integer>> buckets  = new ArrayList<>(nums.length);
       int[] keys = new int[k];
       for(int i =0;i <= nums.length;i++){
            buckets.add(new ArrayList<>()); 
       }
       for(Integer num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
       }

       for(int key : map.keySet()){
        buckets.get(map.get(key)).add(key);
       }
       for(int j = nums.length , a = 0; j>= 0; j--){
            for(Integer key : buckets.get(j)){
                keys[a++] = key;
                if(a == k) return keys; 
            }
        
       } 
      
         return keys; 
       
   }
}
