public class GameOfLife289 {

    static class Solution {
        void gameOfLife(int[][] board) {
            int rows = board.length;
            int cols = board[0].length;

            int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1},  {1, 0},  {1, 1}
            };

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    int liveNeighbors = 0;

                    for (int[] direction : directions) {
                        int nr = r + direction[0];
                        int nc = c + direction[1];

                        if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && Math.abs(board[nr][nc]) == 1) {
                            liveNeighbors++;
                        }
                    }

                    if (board[r][c] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                        board[r][c] = -1;
                    }
                    if (board[r][c] == 0 && liveNeighbors == 3) {
                        board[r][c] = 2;
                    }
                }
            }

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (board[r][c] > 0) {
                        board[r][c] = 1;
                    } else {
                        board[r][c] = 0;
                    }
                }
            }
        }
    }

    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };

        Solution solution = new Solution();
        solution.gameOfLife(board);
        printBoard(board);
    }
}
