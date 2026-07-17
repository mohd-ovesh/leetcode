import java.util.List;
import java.util.ArrayList;

class Solution{
    public List<List<Integer>> generate(int numRows){
       List<List<Integer>> pascalsTriangle = new ArrayList<>();
       for(int i = 0; i<numRows; i++){
           pascalsTriangle.add(generateRow(i)); 
       } 
       return pascalsTriangle;
    }

    List<Integer> generateRow(int index){
        List<Integer> row = new ArrayList<>();
        int element = 1;
        row.add(element);
        for(int i = 0; i< index; i++){
            element = (element * (index - i))/(i+1);
            row.add(element);
        }
        return row;
    }
}
