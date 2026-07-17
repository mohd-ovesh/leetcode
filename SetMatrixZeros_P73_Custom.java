class Solution{
    public void setZeroes(int[][] matrix){
        int noOfRows = matrix.length;
        int noOfColumns = matrix[0].length;
        int[] zeroRows = new int[noOfRows];
        int[] zeroColumns = new int[noOfColumns];

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
               if(matrix[i][j] == 0){
                   zeroRows[i] = 1;
                   zeroColumns[j] = 1;
               } 
            }
        }

        for(int i = 0; i<zeroRows.length; i++){
            if(zeroRows[i] == 1){
                 setRowZeros(matrix[i]);
            }
        }
        
        for(int j = 0; j<zeroColumns.length;j++){
            if(zeroColumns[j] == 1){
                 setColumnZeros(j,matrix);
            }
        }

    }
    public void setRowZeros(int[] row){
           for(int i =0; i<row.length;i++){
                row[i] = 0;
           }
        }

        public void setColumnZeros(int column, int[][] matrix){
            for(int[] row : matrix){
               row[column] = 0;
            }
    }
}
