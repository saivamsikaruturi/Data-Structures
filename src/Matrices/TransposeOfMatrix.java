package Matrices;

public class TransposeOfMatrix {
    public static int[][] transponse(int[][] array){
        for(int i =0;i< array.length;i++){
            int left = 0,right = array[0].length-1;
            while(left<right){
                int temp = array[left][right];
                array[left][right]=array[right][left];
                array[right][left]=temp;
                left++;
                right--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] originalMatrix = {
                {2, 4, -1},
                {-10, 5, 11},
                {18, -7, 6}
        };
        int[][] transponse = transponse(originalMatrix);
        for(int i =0;i< transponse.length;i++){
            for(int j =0;j<transponse[0].length;j++){
                System.out.print(transponse[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
