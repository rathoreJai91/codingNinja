package Recursion.Assignment;

public class RatInAMaze {
    
    private static boolean solveMaze(int maze[][], int i, int j, int path[][]){
        //check if i and j cell is valid or not
        int n=maze.length;
        if( i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            return false;
        }
        //Include the current cell in path
        path[i][j]=1;
        //If current cell is the destination cell
        if(i==n-1 && j==n-1){
            return true;
        }
        //Go to the next cells
        if(solveMaze(maze, i-1, j, path))return true;//going up
        else if(solveMaze(maze, i, j+1, path)) return true;//going right
        else if(solveMaze(maze, i+1, j, path)) return true;//going down
        else if(solveMaze(maze, i, j-1, path)) return true;//going left

        path[i][j]=0;
        return false;
    }

    private static void printAllPaths(int maze[][], int i, int j, int path[][]) {
		// check if i and j cell is valid or not
		int n = maze.length;
		if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return;
		}
		// Include the current cell in path
		path[i][j] = 1;
		// If current cell is the destination cell
		if (i==n-1 && j==n-1) {
			for(int r=0;r<n;r++){
				for(int c=0;c<n;c++){
					System.out.print(path[r][c]+" ");
				}
			}
			System.out.println();
            path[i][j]=0;
			return;
		}
		// Go to the next cells
		printAllPaths(maze, i-1, j, path);
		printAllPaths(maze, i+1, j, path);
		printAllPaths(maze, i, j-1, path);
		printAllPaths(maze, i, j+1, path);
        path[i][j]=0;
	}

    public static boolean ratInMaze(int maze[][]){
        int path[][] = new int[maze.length][maze.length];
        // for(int i=0;i<path.length;i++){
        //     for(int j=0;j<path.length;j++){
        //         path[i][j]=0;
        //     }
        // }
        printAllPaths(maze, 0, 0, path);
        return solveMaze(maze, 0, 0, path);
    }
     

}
