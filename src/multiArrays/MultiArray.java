package multiArrays;

public class MultiArray {
    char[][] twoDimArray;
    final int ROWS = 4;
    final int COLS = 4;

    public void initializeArray() {
        twoDimArray = new char[][]{{'a', 'b', 'c', 'd'}, {'e', 'f', 'g', 'h'}, {'i', 'j', 'k', 'l'}, {'m', 'n', 'o', 'p'}};
    }

    public void printArray() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---");
    }

    public void printRow(int rowIndex) {
        for (int i = 0; i < COLS; i++) {
            System.out.print(twoDimArray[rowIndex][i] + " ");
        }
        System.out.println();
        System.out.println("---");
    }

    void printSnowFlakes() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---");
    }

    public void printStarDiagonal() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
        MultiArray letters = new MultiArray();
        letters.initializeArray();
        letters.printArray();
        letters.printRow(3);
        letters.printSnowFlakes();
    }
}
