public class Main {
    public static void main(String[] args) {
        String[][] letterB = new String[8][6];

        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                if (j == 0 ||
                        ((i == 0 || i == 3 || i == 7) && j < 5) ||  
                        (j == 5 && i != 0 && i != 3 && i != 7))
                {
                    letterB[i][j] = "*";
                } else {
                    letterB[i][j] = " ";
                }
            }
        }

        for (String[] row : letterB) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
