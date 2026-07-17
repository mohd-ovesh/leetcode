import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

class Solution{
    
    public List<List<Integer>> generate(int numRows){
       List<List<Integer>> pascalsTriangle = new ArrayList<>();

       for(int i = 0; i<numRows; i++){
            pascalsTriangle.add(generateRow(i));
       } 

       return pascalsTriangle;
    }

    BigInteger factorial(BigInteger num){
        BigInteger factorial = BigInteger.ONE;
            for(BigInteger i= BigInteger.TWO; num.compareTo(i) >= 0; i = i.add(BigInteger.ONE)){
                factorial = factorial.multiply(i);    
            }
        return factorial;
        }
        
    Integer Choose(BigInteger num,BigInteger k){
        BigInteger combination = factorial(num).divide(factorial(num.subtract(k))).divide(factorial(k));
        return combination.intValueExact();
    }

    List<Integer> generateRow(int index){
        BigInteger INDEX = BigInteger.valueOf(index);
        List<Integer> row = new ArrayList<>(); 
        for(BigInteger i= BigInteger.ZERO;INDEX.compareTo(i) >= 0;i = i.add(BigInteger.ONE)){
           row.add(Choose(INDEX,i)); 
        }
        return row;
    }

}
