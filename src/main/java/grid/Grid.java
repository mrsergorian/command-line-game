package grid;

public class Grid {
    public final int HEIGHT = 10;
    public final int WIDTH = HEIGHT * 2;

    private final Tile[][] grid = new Tile[HEIGHT][WIDTH];

    public Grid() {
        fill();
    }

    private void fill() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if ((y == 0) || (y == HEIGHT - 1) || (x == 0) || (x == WIDTH - 1)) {
                    grid[y][x] = new Tile(Tile.Type.WALL); // Fill the walls
                } else {
                    grid[y][x] = new Tile(Tile.Type.GROUND);
                }
            }
        }
    }

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
