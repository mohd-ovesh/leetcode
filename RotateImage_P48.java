class Solution{
    public void rotate(int[][] matrix){
         int size = matrix[0].length;
         int temp;
         // Simple in-place transpose formation by switching around the i,j the element with the j,i th element in the matrix; classic technique
         for(int i = 0; i <size; i++ ){
            for(int j = i+1; j<size; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
         }

        // for all rows iterate over it and reverse each row in place efficiently
         for(int i = 0; i< size; i++){
            int left = 0;
            int right = size-1;
            while(left<right){
                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }   
         }
   }
}

