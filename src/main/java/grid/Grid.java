package grid;

public class Grid {
    public final int HEIGHT = 10;
    public final int WIDTH = HEIGHT * 2;

    private final Tile[][] grid = new Tile[HEIGHT][WIDTH];

    public Grid() {
        fill();
    }

    public void fill() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                // Fill the walls
                if (y == 0 || y == HEIGHT - 1 || x == 0 || x == WIDTH - 1) {
                    grid[y][x] = new Tile(Tile.Type.WALL);
                } else {
                    grid[y][x] = new Tile(Tile.Type.GROUND);
                }
            }
        }
    }

    public void print() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
    }
}
