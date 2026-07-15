import java.util.ArrayList;
import java.util.Comparator;

class Pair{
    Integer key;
    Integer value;
 
    Pair(Integer key, Integer value){
        this.key = key;
        this.value = value;
    }
}
class Solution{
    ArrayList<Pair> Pairs = new ArrayList<>();
    public int[] topKFrequent(int[] nums, int k){
    int[] keys = new int[k];
        for(int i=0; i<nums.length; i++){
            if(!keyInPairs(nums[i])){
                Pairs.add(new Pair(nums[i],1));
                continue;
            }  
            getPairWithKey(nums[i]).value++;
        }
        Comparator<Pair> mostFrequent = new Comparator<>() {
        public int compare(Pair pair1, Pair pair2){
            return Integer.compare(pair1.value, pair2.value);
        }
    };

    Pairs.sort(mostFrequent);
    
    for(int i = 1; i<k+1; i++){
        keys[i-1] = Pairs.get(Pairs.size()-i).key;
    }

    return keys;
    }

    private boolean keyInPairs(Integer key){
       for(Pair pair : Pairs){
         if(pair.key.equals(key)) return true;  
       } 
       return false;
    }
    
    private Pair getPairWithKey(Integer key){
        for(Pair pair : Pairs){
            if(pair.key.equals(key)) return pair;
        }
    return null;
    }    
    
}
