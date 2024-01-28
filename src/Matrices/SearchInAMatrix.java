package Matrices;

public class SearchInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(search(matrix));
    }

    private static boolean search(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j]==5){
                    return true;

                }
            }
        }
        return false;
    }
}
