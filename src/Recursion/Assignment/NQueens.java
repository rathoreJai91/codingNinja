package Recursion.Assignment;

public class NQueens {
    
    public static void placeNQueens(int n){
        int board[][] = new int[n][n];
        placeQueens(board,n,0);
    }

    private static void placeQueens(int[][] board, int n, int row) {
        if(row==n){
            printQueens(board,n);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,n,row,i)){
                board[row][i] = 1;
                placeQueens(board, n, row+1);
                board[row][i] = 0;
            }
        }
    }

    private static boolean isSafe(int[][] board, int n, int row, int col) {
        
        //check the current column
        for(int i=row;i>=0;i--){
            if(board[i][col]==1){
                return false;
            }
        }
        //check the upper left diagonal is there any queen present 
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        //check the upper right diagonal is there any queen present
        for(int i=row,j=col;i<n && j>=0;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }

    private static void printQueens(int[][] board, int n) {

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(board[i][j]+" ");
            }
        }
        System.out.println();
    }
}
