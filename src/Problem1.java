public class Problem1 {
    public static String search(int[][] matrix,int valueToFind){
        for (int i = 0; i < matrix.length ;i++){
            for (int j = 0; j < matrix[i].length ;j++){
                if (matrix[i][j]  == valueToFind){
                    return i+","+j;
                }
            }   
        }
        return null;   
    }

    public static String betterSearch(int[][] matrix,int valueToFind){
        int row = matrix.length;
        int colSize = matrix[0].length;

        for (int i = 0; i < row ;i++){
            int lastCell = matrix[i][colSize-1]; 
            if(lastCell>=valueToFind){
                int col = colSize-1;
                while(col >=0 && matrix[i][col]!=valueToFind){
                    col--;
                }
                if (col>=0){
                    return  i+","+col;
                }   
            }
        }
                return null;
    }
            
    public static void main(String[] args) throws Exception {
        final int[][] CAT =  {{0,6,9,22,25,47},
                             {3,11,19,27,45,49},
                             {13,18,29,42,52,69},
                             {16,31,51,55,67,75},
                             {34,38,57,65,77,89},
                             {61,62,82,85,97,98}};

        System.out.println(search(CAT,57));
        System.out.println("\n");
        System.out.println(betterSearch(CAT,57));
        
    }
}
