class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int lo = 0;
        int high = (rowSize * colSize) - 1;
        while(lo <= high){
            int mid = lo + (high - lo)/2;
            if(matrix[mid/colSize][mid%colSize] == target){
                return true;
            }
            else if(matrix[mid/colSize][mid%colSize]>target){
                high = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return false;
    }
}
