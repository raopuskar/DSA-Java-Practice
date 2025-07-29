import java.util.*;

public class RatMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        List<String> paths = findPath(maze);
        System.out.println(paths);
    }

    static List<String> findPath(int[][] maze) {
        List<String> res = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];

        if (maze[0][0] == 1)
            backtrack(0, 0, maze, "", visited, res);

        return res;
    }

    static void backtrack(int i, int j, int[][] maze, String path, boolean[][] visited, List<String> res) {
        int n = maze.length;

        // Base Case: Reached destination
        if (i == n - 1 && j == n - 1) {
            res.add(path);
            return;
        }

        // Directions: D, L, R, U (Lexicographic order)
        int[] di = {1, 0, 0, -1};
        int[] dj = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};

        for (int k = 0; k < 4; k++) {
            int ni = i + di[k];
            int nj = j + dj[k];

            if (ni >= 0 && nj >= 0 && ni < n && nj < n &&
                maze[ni][nj] == 1 && !visited[ni][nj]) {

                visited[i][j] = true;
                backtrack(ni, nj, maze, path + dir[k], visited, res);
                visited[i][j] = false; // backtrack
            }
        }
    }
}
