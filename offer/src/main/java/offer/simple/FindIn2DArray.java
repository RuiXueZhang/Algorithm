package offer.simple;

public class FindIn2DArray {

    public static void main(String[] args){
        System.out.println(findNumberIn2DArray(new int[1][0], -10));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        matrix = new int[][]{
                {-5},
        };

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length;
        int currentRow = 0;
        int cloumns = matrix[0].length;
        int currentcCol = cloumns -1;

        while (currentcCol > -1 && currentRow < row) {
            if (matrix[currentRow][currentcCol] == target){
                return true;
            }else if(matrix[currentRow][currentcCol] > target){
                currentcCol--;
            }else {
                currentRow++;
            }

        }
        return false;

    }
}
