public class Problem1 {
    public static String search(int[][] matrix,int valueToFind){
        int row = matrix.length;

        int [] row0 = matrix[0];
        int [] row1 = matrix[1];
        int [] row2 = matrix[2];
        int [] row3 = matrix[3];
        int [] row4 = matrix[4];
        int [] row5 = matrix[5];

        for (int i=0; i < row ;i++){ 
            if(row0[i]==valueToFind){
                return "0,"+i;
            }
            else if(row1[i]==valueToFind){
                return "1,"+i;
            }
            else if(row2[i]==valueToFind){
                return "2,"+i;
            }
            else if(row3[i]==valueToFind){
                return "3,"+i;
            }
            else if(row4[i]==valueToFind){
                return "4,"+i;
            }
            else if(row5[i]==valueToFind){
                return "5,"+i;
            }
        }
        return null;
    }

    public static String otherSearch(int[][] matrix,int valueToFind){
        int column = matrix[0].length;
        int row = matrix.length;
       
        for (int i = 0; i < row ;i++){
            for (int j = 0; j < column ;j++){
                if (matrix[i][j]  == valueToFind){
                    return i+","+j;
                }
            }   
        }
        return null;
    }
               
    public static void main(String[] args) throws Exception {
        int[][] cat =  {{0,6,9,22,25,47},
                       {3,11,19,27,45,49},
                       {13,18,29,42,52,69},
                       {16,31,51,55,67,75},
                       {34,38,57,65,77,89},
                       {61,62,82,85,97,98}};

        System.out.println(search(cat,57));
        System.out.println("\n");
        System.out.println(otherSearch(cat,57));
     
        
    }
}
