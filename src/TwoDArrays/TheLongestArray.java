package TwoDArrays;

public class TheLongestArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 5, 6},
                {0, 2, 6, 44, -8, 2},
                {5, 8, 8, -6, 5}
        };
        int counter = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i].length > matrix[counter].length) {
                counter = i;
            }
        }
        for (int i = 0; i < matrix[counter].length; i++)
            System.out.print(matrix[counter][i] + " ");
    }
}
