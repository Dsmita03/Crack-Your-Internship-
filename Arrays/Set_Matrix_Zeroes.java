package Arrays;

class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        char row [] = new char[m];
        char col [] = new char[n];

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i]= 'z';
                    col[j] ='z';                
                }
            }
        }

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i]=='z' || col[j]=='z'){
                    matrix[i][j]=0;
                }
            }
        }
    }
    
}