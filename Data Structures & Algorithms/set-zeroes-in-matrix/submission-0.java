class Solution {
    public void setZeroes(int[][] matrix) {
     int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int[] row = new int[rowLen];
        int[] col = new int[colLen];

        for(int i = 0; i< rowLen; i++){
            for(int j = 0; j<colLen; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i< rowLen; i++){
            for(int j = 0; j<colLen; j++){
            if(row[i]==1 || col[j]==1){
                matrix[i][j] = 0;
            }
            }
        }
    
    }
}
