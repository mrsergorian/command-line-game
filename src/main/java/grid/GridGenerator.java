package grid;

import java.util.Random;

public class GridGenerator {
    private final Grid grid;

    public GridGenerator(Grid grid) {
        this.grid = grid;
    }

    /**
     * Generates a grid with wall tiles and random tiles.
     */
    public void generate() {
        for (int y = 0; y < grid.HEIGHT; y++) {
            for (int x = 0; x < grid.WIDTH; x++) {
                // Check if the tile is a corner.
                if ((y == 0) || (y == grid.HEIGHT - 1) || (x == 0)
                        || (x == grid.WIDTH - 1)) {
                    fillWithWallTile(y, x);
                } else {
                    fillWithRandomTile(y, x);
                }
            }
        }
    }

    private void fillWithWallTile(int y, int x) {
        grid.setTile(y, x, new Tile(Tile.Type.WALL));
    }

    private void fillWithRandomTile(int y, int x) {
        Tile[] tiles = new Tile[]{
                new Tile(Tile.Type.GROUND),
                new Tile(Tile.Type.WALL)
        };
        Random random = new Random();
        Tile randomTile = tiles[random.nextInt(tiles.length)];

        // Fill the grid with a random tile from the tiles array.
        grid.setTile(y, x, randomTile);
    }
}
