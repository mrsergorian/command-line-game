package grid;

public class Grid {
    public final int HEIGHT = 10;
    public final int WIDTH = HEIGHT * 2;

    private final Tile[][] grid = new Tile[HEIGHT][WIDTH];

    /**
     * Print the grid in 2D.
     */
    public void print() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
    }

    public Tile getTile(int y, int x) {
        return grid[y][x];
    }

    public void setTile(int y, int x, Tile tile) {
        grid[y][x] = tile;
    }
}
