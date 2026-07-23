import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

class Solution{
    public int[][] merge(int[][] intervals){
        if(intervals.length <= 1) return intervals;

        // The optimal way to solve this problem is to 
        // first sort the given intervals that will take
        // nlogn time to do so and then merge the sorted
        // intervals in n time, looping over it

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        
        // ok using this lambda expression things are sorted now
        // to sort this internally java uses a dual pivot quicksort
        // or someting called Timsort. this is what java uses to sort objects

        List<int[]> merged = new ArrayList<>();
        
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for(int[] nextInterval : intervals){
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];
            
            if(nextStart <= currentEnd){
                currentInterval[1] = Math.max(currentEnd,nextEnd);
            } else {
                currentInterval = nextInterval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
