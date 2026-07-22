class Solution{
   public void rotate(int[][] matrix){
        int i = 0;
        int j = 0;
        int size = matrix[0].length;
        int boundary = size-1;
        rotateHelper(i,j,size,boundary,matrix);
   }

   void rotateHelper(int i, int j, int size,int boundary, int[][] matrix){
        int temp;
        if(size <= 1){return;}

        for(int k = 1; k<size; k++){
            temp = matrix[i][j+k];
            matrix[i][j+k] = matrix[boundary-k][j];
            matrix[boundary-k][j] = matrix[boundary][boundary-k];
            matrix[boundary][boundary-k] = matrix[i+k][boundary];
            matrix[i+k][boundary] = temp;
        }
        
        rotateHelper(i+1,j+1,size-2,boundary-1,matrix);
   }
}
