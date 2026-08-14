class Solution {

    public void islandsAndTreasure(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Add all treasures to the queue
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (grid[r][c] == 0) {
                    queue.offer(new int[]{r, c});
                }
            }
        }

        // Directions: up, down, left, right
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        // Step 2: Multi-source BFS
        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int r = current[0];
            int c = current[1];

            // Check all 4 directions
            for (int[] dir : directions) {

                int nr = r + dir[0];
                int nc = c + dir[1];

                // Check boundaries
                if (nr < 0 || nr >= rows ||
                    nc < 0 || nc >= cols) {
                    continue;
                }

                // Only process unvisited land
                if (grid[nr][nc] == Integer.MAX_VALUE) {

                    grid[nr][nc] = grid[r][c] + 1;

                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}