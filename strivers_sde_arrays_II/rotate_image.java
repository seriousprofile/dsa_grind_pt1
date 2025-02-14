/* basic idea of this problem is this: 
in order to rotate a 2D array by 90 degrees, you just have to find 
1. the transpose, followed by
2. reversal of each row to obtain the final result! */

class Solution {

    public void rotate(int[][] matrix) {

      //code to find the transpose of the matrix:
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

      //code to find the reverse of each row
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
