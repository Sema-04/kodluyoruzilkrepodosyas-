public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3 ,4},
                {5, 6, 7, 8}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Orijinal Matris:");
        for (int[] r : matrix) {
            for (int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze Matris:");
        for (int[] r : transpose) {
            for (int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
