class Solution{
    public void setZeroes(int[][] matrix){
        boolean firstRowHasZero = checkFirstRow(matrix[0]);
        boolean firstColumnHasZero = checkFirstColumn(matrix);
        int noOfRows = matrix.length;
        int noOfColumns = matrix[0].length;
        
        for(int i = 1; i<noOfRows; i++){
            for(int j = 1; j<noOfColumns; j++){
               if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
               }
            }
        }

        for(int j = 1; j<noOfColumns ; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i<noOfRows; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i = 1; i<noOfRows ; i++){
            if(matrix[i][0] == 0 ){
                for(int j = 1; j<noOfColumns ; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRowHasZero){
            for(int j = 0; j<noOfColumns; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstColumnHasZero){
            for(int i = 0; i<noOfRows; i++){
                matrix[i][0] = 0;
            }
        }

        
    }

    boolean checkFirstRow(int[] firstRow){
     for(int element : firstRow){
        if(element ==  0) return true;
     }
     return false;
    }

    boolean checkFirstColumn(int[][] matrix){
        for(int[] row : matrix){
         if(row[0] == 0) return true;
        }
        return false;
    }
}
