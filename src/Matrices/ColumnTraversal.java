package Matrices;

public class ColumnTraversal {
    public static void main(String[] args) {

 /*       [ 1  2 3  4
           5  6 7  8
           9  1 2  7]*/
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,1,2,7}};
        for(int i =0;i<matrix[0].length;i++){
            for(int j =0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
