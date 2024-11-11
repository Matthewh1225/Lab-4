import java.util.*;

public class Problem2 {

    public static int moveRight(int x){
        x=x+1;
        return x;
    }

    public static int moveDown(int x){
        x=x+1;
        return x;
    }
    public static int moveLeft(int x){

        x=x-1;
        return x;
    }
    static void high(){
        System.out.println("wowow");
        
    }
    public static List<String> mazeSolver(int[][] maze){
       
        final int[] START = {0,0};
        final int [] END ={8,8};
     
        boolean back = false;

        int rowCount=0;
        int colCount=0;

        int[] splitPoint= { 0,0};

        int[] currentPosition = {rowCount,colCount};
       
        int currentValue = maze[rowCount][colCount];
        
        int neighbors=0;

        int currentCol= currentPosition[1];
        int currentRow = currentPosition[0];
       

        int rightValue = maze[currentRow][currentCol+1];
        int leftValue=0;
        if ( currentCol==0) {
            leftValue=1;
        }
        else{leftValue=maze[currentRow][currentCol-1];

        }
      
        int downValue=maze[currentRow+1][currentCol];
    
        int[] rightPosition =  {currentRow,currentCol+1};
        int[] downPosition = {currentRow+1,currentCol};
        int[] leftPosition ={currentRow,currentCol-1};
        if (leftPosition[1]<0){

            leftPosition[1]=0;
        }


        List<String> path1 = new ArrayList<>();

        // current=last
        // next=current
        
        int savedSteps=0;
        int step=0;
        Boolean split=false;
        
        while(currentPosition != END){
           
            
            
            if ( currentCol==0) {
                leftValue=1;
            }
            else{leftValue=maze[currentRow][currentCol-1];
    
            }
            currentPosition[0]=currentRow;
            currentPosition[1]=currentCol;
            downValue=maze[currentRow+1][currentCol];
            downPosition[0] = currentRow-1;
            rightValue = maze[currentRow][currentCol+1];
            

            path1.add(Arrays.toString(currentPosition));
            step++;

            if (currentValue==1) {
                return null;
                
            }
            
            else if(rightValue == 0 && downValue == 0){
               if (lastPosition==path1.get(step))
                if(!split){
                    splitPoint[1]= currentCol;
                    splitPoint[0]=currentRow;
                    savedSteps=step;
                
                    currentCol++;
                }
                else{
                    currentRow++;
                }
                
               
            
                
    
            }
            else if (rightValue==1 && downValue ==0 ){
                currentRow++;
             
                

            }
        
            else if (rightValue==1 && leftValue==1 && downValue==1){
                currentPosition=splitPoint;
                currentCol=splitPoint[1];
                currentRow=splitPoint[0];

                for (int i = path1.size()-1; i > savedSteps-2 ;i--){ 
                    path1.remove(i);
                }
                split=true;
                
                
            }
            else if (rightValue==0){
                currentCol++;
            }
            else if (leftValue == 0){
               currentCol--;
            } 
           
        }  
        return null;
        
}
    public static void main(String[] args) {
        int[][] maze = {{0,0,1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,0,0,1},
                        {1,0,1,1,0,1,1,0,1},
                        {1,0,1,0,0,1,0,0,1},
                        {1,0,1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,1,0,1},
                        {1,1,0,1,1,0,1,1,1},
                        {1,0,0,0,0,0,0,0,0},
                        {1,1,1,1,1,1,1,1,0}}; 

        System.out.println(mazeSolver(maze));
        high();
    }
} 
     
