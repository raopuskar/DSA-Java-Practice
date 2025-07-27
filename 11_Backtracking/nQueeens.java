import java.util.*;

public class nQueeens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');

        Set<Integer> cols = new HashSet<>();
        Set<Integer> leftDiag = new HashSet<>();
        Set<Integer> rightDiag = new HashSet<>();

        backtrack(0, n, board, cols, leftDiag, rightDiag, result);
        return result;
    }

    static void backtrack(int row, int n, char[][] board, Set<Integer> cols,
                          Set<Integer> leftDiag, Set<Integer> rightDiag,
                          List<List<String>> result) {

        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board) {
                solution.add(new String(r));
            }
            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols.contains(col) || leftDiag.contains(row - col) || rightDiag.contains(row + col)) {
                continue; // Not safe
            }

            // Place queen
            board[row][col] = 'Q';
            cols.add(col);
            leftDiag.add(row - col);
            rightDiag.add(row + col);

            // Recur to next row
            backtrack(row + 1, n, board, cols, leftDiag, rightDiag, result);

            // Backtrack
            board[row][col] = '.';
            cols.remove(col);
            leftDiag.remove(row - col);
            rightDiag.remove(row + col);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        int count = 1;
        for (List<String> sol : solutions) {
            System.out.println("Solution " + count++ + ":");
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
