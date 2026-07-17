// This one uses the pascal's identity
//Also learnt about a new mthod List.of to creat an immutable unreadable list, sweet
import java.util.List;
import java.util.ArrayList;

class Solution{
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        pascalsTriangle.add(new ArrayList<Integer>(List.of(1)));
        for(int i = 1; i<numRows; i++){
            pascalsTriangle.add(generateRow(pascalsTriangle.get(i-1)));
        }
        return pascalsTriangle;
    }

    List<Integer> generateRow(List<Integer> prevRow){
    List<Integer> row = new ArrayList<>();
    for(int i = 0,j=1; j<prevRow.size(); i++,j++){
        row.add(prevRow.get(i) + prevRow.get(j));
    }
    padRow(row); 
    return row;
    }

    void padRow(List<Integer> row){
         row.add(1);
         row.add(0,1); 
    }
}
