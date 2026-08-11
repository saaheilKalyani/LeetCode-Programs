class Solution {
    public int neighbour(int[][] board, int m,int n) {
        int cnt = 0; 
        int rows = board.length; 
        int cols = board[0].length;  
        int dr[] = {-1,-1,-1,0,0,1,1,1}; 
        int dc[] = {-1,0,1,-1,1,-1,0,1};  
        for (int k = 0; k<8; k++) {
            int nr = m + dr[k]; 
            int nc = n + dc[k];
            if (nr >= 0 && nr < rows && nc >=0 && nc < cols && ( board[nr][nc] == 1 || board[nr][nc] == -1 )) {
                cnt++; 
            } 
        }
        return cnt;
    }
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int n = neighbour(board, i, j); 
                if ((board[i][j] == 1) && (n < 2)) board[i][j] = -1; 
                else if (board[i][j] == 1 && ( n == 2 || n == 3 )) board[i][j] = 1;
                else if (board[i][j] == 1 && n > 3) board[i][j] = -1;
                else if (board[i][j] == 0 && n == 3) board[i][j] = 2;
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j =0; j < board[i].length; j++) {
                if (board[i][j] == -1) board[i][j] = 0; 
                else if (board[i][j] == 2) board[i][j] = 1; 
            }
        }

    }
}