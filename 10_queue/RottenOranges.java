import java.util.*;

public class RottenOranges {
    static class Pair {
        int row, col, time;
        Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        int freshCount = 0;
        int time = 0;

        // Add all rotten oranges to queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = true;
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // 4 directions: up, down, left, right
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};
        int rotted = 0;

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            time = curr.time;

            for (int d = 0; d < 4; d++) {
                int r = curr.row + dRow[d];
                int c = curr.col + dCol[d];

                if (r >= 0 && r < m && c >= 0 && c < n &&
                    !visited[r][c] && grid[r][c] == 1) {
                    visited[r][c] = true;
                    q.add(new Pair(r, c, time + 1));
                    rotted++;
                }
            }
        }

        return rotted == freshCount ? time : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };
        System.out.println("Minutes: " + orangesRotting(grid)); // Output: 4
    }
}
