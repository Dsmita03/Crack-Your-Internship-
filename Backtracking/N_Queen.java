package Backtracking;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] chessBoard = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                chessBoard[i][j] = '.';
            }
        }
        nQueens(ans, chessBoard, 0);
        return ans;
       
    }

    public static void nQueens(List<List<String>> ans, char[][] chessBoard, int row){
        if(chessBoard.length==row){
            ans.add(getBoard(chessBoard));
            return;
        }
        for(int j = 0; j < chessBoard.length; j++){
            if(isSafe(chessBoard, row, j)){
                chessBoard[row][j]='Q';     //assign the queen
                nQueens(ans, chessBoard, row+1);  //recursion to place the all queens at right pos
                chessBoard[row][j]='.';     // backtrack when the position is not right
            }
        }
    }

    public static boolean isSafe(char[][] chessBoard, int row, int col){
                //vertical up
        for(int i = row-1; i >= 0; i--){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }

        //left diagonal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        //right diagonal
        for(int i = row-1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static List<String> getBoard(char[][] chessBoard){

        List<String> res = new ArrayList<>();
        for(int j = 0; j < chessBoard.length; j++){
            String row = new String(chessBoard[j]);
            res.add(row);
        }
        return res;
    }

}