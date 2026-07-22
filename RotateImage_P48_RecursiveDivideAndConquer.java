class Solution{
    public void rotate(int[][] matrix){
        int size = matrix[0].length;
        int boundary = size-1;
        int[] one = new int[size];
        int[] two = new int[size];
        int[] three = new int[size];
        int[] zero  = new int[size];
        int i = 0;
        int j = 0;
        rotateHelper(i,j,size,boundary,matrix,one,two,three,zero);
    }

    void rotateHelper(int i, int j, int size, int boundary,  int[][] matrix,int[] one, int[] two, int[] three, int[] zero){
        if(size <= 1){return;}
        initialize(i,j,size,boundary,matrix,one,two,three,zero);
        rotateBoundary(i,j,size,boundary,matrix,one,two,three,zero);
        rotateHelper(i+1,j+1,size-2,boundary-1,matrix,one,two,three,zero);        
    }

    void initialize(int i, int j, int size,int boundary, int[][] matrix,int[] one, int[] two, int[] three, int[] zero){
        for(int k = 0; k< size; k++){
            one[k] = matrix[i][j+k];
            two[k] = matrix[i+k][boundary];
            three[k] = matrix[boundary][j+k];
            zero[k] = matrix[i+k][j];
        }
    }
    void rotateBoundary(int i, int j, int size, int boundary, int[][] matrix,int[] one, int[] two, int[] three, int[] zero){
        for(int k = 0; k< size; k++){
            matrix[i][j+k]  = zero[size-1-k];
            matrix[i+k][boundary] = one[k];
            matrix[boundary][j+k] = two[size-1-k];
            matrix[i+k][j] = three[k];
        }
    }
}
