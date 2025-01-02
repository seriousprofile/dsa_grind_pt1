class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length; //represents the rows
        int n = matrix[0].length; //represents the column

        boolean frz = false; //first row zero variable
        boolean fcz = false; //first column zero variable

        for(int i = 0; i < n; i++){ //checks if first row has any zeroes
            if(matrix[0][i] == 0){
                frz = true; //if it does, update flag
            }
        }

        for(int i = 0; i < m; i++){ //checks if first column has any zeroes
            if(matrix[i][0] == 0){
                fcz = true; //if it does, update flag
            }
        }

        //next, we have to check digits apart from first row and column
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //update zeroes according to the zero marks in first row and column
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //going back to case 1, if first row has any zeroes:
        if(frz == true){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        }

        //if first column has any zeroes:
        if(fcz == true){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
