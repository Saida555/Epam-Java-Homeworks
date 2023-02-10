import java.util.Arrays;

public class MergedArrays {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {5, 6, 7}
        };
        int[] result = mergeArrays(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] mergeArrays(int[][] matrix) {
        int[] arr = new int[matrix[0].length + matrix[1].length];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }
        return arr;
    }
}