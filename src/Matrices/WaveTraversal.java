package Matrices;

public class WaveTraversal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i =0;i<matrix[0].length;i++){
            if(i%2==0) {
                for (int j = 0; j < matrix.length; j++) {

                    System.out.println(matrix[j][i]);
                }
            }

            else{
                for(int j = matrix.length-1;j>=0;j--){
                    System.out.println(matrix[j][i]);
                }
            }
        }
    }
}
