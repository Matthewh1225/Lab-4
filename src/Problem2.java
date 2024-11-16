public class Problem2 {
    public static void mazeSolver(int[][] maze,int x, int y){
        maze[x][y] = 8;
        if(x == 8 && y == 8){
            prinMaze(maze); 
            maze[x][y] = 0;
            return;
        }
        
        int[] right= {x,y+1};
        int[] left={x,y-1};
        int[] up={x-1,y};
        int[] down= {x+1,y};
        int[][] possibleMoves={right,down,left,up};
        for(int[] move:possibleMoves){
            if(validity(maze, move[0], move[1])){
                mazeSolver(maze, move[0], move[1]);
            }
        }
        maze[x][y]=0;
    }
    public static void prinMaze(int [][] maze) {
        System.out.println("Soulution found!\n");
        for (int[] row : maze) {
            for (int col : row) {
                String s = " "; 
                if(col==1){

                    s = "▒"; 
                }
                if (col==8){

                    s= "█";
                }
                System.out.print(s);
            }

            System.out.println();
        }
        System.out.println();
    }
    public static boolean validity (int[][] maze, int x,int y) {
        if(maze.length==0 || x >= maze.length || x<0 || y<0 || y >= maze[x].length) {
            return false;
        }
        return maze[x][y]==0; 
    }
 
    public static void main(String[] args) {
        int[][] maze = {{0,0,1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,0,0,1},
                        {1,0,1,1,0,1,1,0,1},
                        {1,0,1,0,0,1,0,0,1},
                        {1,0,1,0,1,1,1,0,1},
                        {1,0,0,0,0,0,1,0,1},
                        {1,1,0,1,1,0,1,1,1},
                        {1,0,0,0,0,0,0,0,0},
                        {1,1,1,1,1,1,1,1,0}}; 

            mazeSolver(maze, 0, 0);    
    }
} 


     
