
import java.util.*;

class Queen {
    public static void main(String[] args) {
            int[][] board = new int[4][4];
            recursion(board, 0);
            
    }
	
	public static boolean recursion(int[][] board, int c){
	    if(c==4){
	        for(int i=0; i<4; i++){
	            for(int j=0; j<4; j++){
	                System.out.print(board[i][j]);
	            }
	            System.out.println();
	        }
	        return true;
	    }
	    
	    for(int r=0; r<4; r++){
	        if(isSafe(board, c, r)){
	            board[c][r] = 1;
	            if(recursion(board, c+1)) return true;
	            board[c][r] = 0;
	        }
	    }
	    return false;
	}
	
	public static boolean isSafe(int[][] board, int c, int r){
	    int i = c;
	    int j = r;
	    
	    while(i>=0 && j>=0){
	        if(board[i][j]==1) return false;
	        i--;
	        j--;
	    }

	    i = c;
	    j = r;
	    while(i>=0){
	        if(board[i][j]==1) return false;
	        i--;
	    }

	    i = c;
	    j = r;
	    while(i>=0 && j<4){
	        if(board[i][j]==1) return false;
	        i--;
	        j++;
	    }
	    
	    return true;
	}
}