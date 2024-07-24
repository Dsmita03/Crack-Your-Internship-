package Arrays;
class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] vis=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0; j<board[0].length;j++){
                if(dfs(board, i, j,0,word,vis)){
                    return true;
                }

            }
        }
        return false;
        
    }
    public boolean dfs(char[][] board,int i, int j,int count, String word,boolean[][] vis){
        if(count == word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>= board[0].length || vis[i][j] || !(board[i][j]== word.charAt(count))){
            return false;
        }
        vis[i][j]=true;
        if(dfs(board,i+1,j,count+1,word,vis)||
        dfs(board,i-1,j,count+1,word,vis)||
        dfs(board,i,j+1,count+1,word,vis)||
        dfs(board,i,j-1,count+1,word,vis)){
            return true;
        }
        vis[i][j]=false;
        return false;
    }
}