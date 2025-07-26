public class wordSrch2D {

    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // Loop over every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Start DFS if first letter matches
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS recursive function
    public static boolean dfs(char[][] board, String word, int i, int j, int index) {
        // Base Case: all characters matched
        if (index == word.length()) return true;

        // Boundary and character match check
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length 
            || board[i][j] != word.charAt(index)) return false;

        // Mark current cell as visited by replacing with #
        char temp = board[i][j];
        board[i][j] = '#';

        // Explore all 4 directions
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);

        // Backtrack: restore the original character
        board[i][j] = temp;

        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";

        System.out.println("Word Exists? " + exist(board, word));  // Output: true
    }
}
