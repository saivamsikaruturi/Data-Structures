package Matrices;

public class RowTraversal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,1,2,7}};
        rowTraversing(matrix);
    }

    public static void rowTraversing(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

