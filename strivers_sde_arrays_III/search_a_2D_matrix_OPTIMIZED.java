/* we just simply traverse based on target's val. if target is greater than current val, it means that we need to go to the next row
  (note that this is an array in ascending order so the j pointer placed at last already checks the greatest element.)
  if the target is lesser than current value, just decrement j to get closer to/ reach it. */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = 0; 
        int j = matrix[0].length - 1; 

        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            } else if (matrix[i][j] > target){
                j--;
            } else {
                i++;
            }
        }

        return false; 
    }
}
