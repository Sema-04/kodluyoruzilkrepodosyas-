import java.util.Random;
import java.util.Scanner;
public class mayintarlasioyunu {
    static String[][] board;
    static String[][] hiddenBoard;
    static int rows, cols, mines;
    static boolean gameOver = false;
    static int uncoveredCells = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeGame(scanner);
        while (!gameOver) {
            printBoard();
            playerMove(scanner);
            checkGameStatus();
        }

        scanner.close();
    }
    public static void initializeGame(Scanner scanner) {

        do {
            System.out.print("Satır sayısını girin (min 2): ");
            rows = scanner.nextInt();
            System.out.print("Sütun sayısını girin (min 2): ");
            cols = scanner.nextInt();
            if (rows < 2 || cols < 2) {
                System.out.println("Satır ve sütun boyutu minimum 2 olmalıdır.");
            }
        } while (rows < 2 || cols < 2);

        int totalCells = rows * cols;
        mines = totalCells / 4;
        board = new String[rows][cols];
        hiddenBoard = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = "-";
                hiddenBoard[i][j] = "-";
            }
        }
        placeMines();
    }
    public static void placeMines() {
        Random rand = new Random();
        int placedMines = 0;

        while (placedMines < mines) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            if (hiddenBoard[r][c].equals("-")) {
                hiddenBoard[r][c] = "*";
                placedMines++;
            }
        }
    }
    public static void printBoard() {
        System.out.println("\nMevcut Durum:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void playerMove(Scanner scanner) {
        int row, col;
        boolean validMove = false;

        while (!validMove) {
            System.out.print("Bir satır (0-" + (rows - 1) + ") girin: ");
            row = scanner.nextInt();
            System.out.print("Bir sütun (0-" + (cols - 1) + ") girin: ");
            col = scanner.nextInt();

            if (row < 0 || row >= rows || col < 0 || col >= cols) {
                System.out.println("Geçersiz koordinatlar! Lütfen geçerli bir konum girin.");
            } else if (!board[row][col].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi. Lütfen başka bir koordinat girin.");
            } else {
                validMove = true;
                revealCell(row, col);
            }
        }
    }
    public static void revealCell(int row, int col) {
        if (hiddenBoard[row][col].equals("*")) {
            board[row][col] = "*";
            gameOver = true;
            printBoard();
            System.out.println("Mayına bastınız! Oyun bitti.");
        } else {
            int mineCount = countAdjacentMines(row, col);
            board[row][col] = Integer.toString(mineCount);
            uncoveredCells++;
            if (uncoveredCells == (rows * cols - mines)) {
                gameOver = true;
                printBoard();
                System.out.println("Tebrikler! Tüm mayınlara basmadan oyunu kazandınız.");
            }
        }
    }
    public static int countAdjacentMines(int row, int col) {
        int mineCount = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int r = row + i;
                int c = col + j;
                if (r >= 0 && r < rows && c >= 0 && c < cols && hiddenBoard[r][c].equals("*")) {
                    mineCount++;
                }
            }
        }
        return mineCount;
    }
    public static void checkGameStatus() {
        if (gameOver) {
            if (uncoveredCells == (rows * cols - mines)) {
                System.out.println("Tebrikler! Tüm kutuları başarıyla açtınız.");
            }
        }
    }
}