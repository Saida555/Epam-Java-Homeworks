public class FirstAndLastElements {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 6, 9},
                {6, -4, 3, 4},
                {5, 7, 8, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][0] + " ");
            System.out.print(matrix[i][matrix[i].length - 1] + " ");
            System.out.println();
        }


    }
}

