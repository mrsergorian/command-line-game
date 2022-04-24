package entity;

import grid.Grid;
import grid.Tile;
import lombok.NonNull;

public class Entity {
    protected int y;
    protected int x;
    protected final @NonNull Tile tile;
    protected final @NonNull Grid grid;

    public Entity(int y, int x, @NonNull Tile tile, @NonNull Grid grid) {
        this.y = y;
        this.x = x;
        this.tile = tile;
        this.grid = grid;
        initTile(); // Initialise the tile on the grid.
    }

    private void initTile() {
        grid.setTile(y, x, tile);
    }
}
