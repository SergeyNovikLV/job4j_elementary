package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char val = 'X';
        for (int i = 0; i < board.length; i++) {
            result = true;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != val) {
                    result = false;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char val = 'X';
        for (int i = 0; i < board.length; i++) {
            result = true;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != val) {
                    result = false;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
            }
        return rsl;
    }
}

