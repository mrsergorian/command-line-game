package entity;

import grid.Grid;
import grid.Tile;

public class Entity {
    protected int y;
    protected int x;
    protected final Tile tile;
    protected final Grid grid;

    public Entity(int y, int x, Tile tile, Grid grid) {
        this.y = y;
        this.x = x;
        this.tile = tile;
        this.grid = grid;
        initTile();
    }

    /**
     * Initialise the tile on the grid.
     */
    public void initTile() {
        grid.setTile(y, x, tile);
    }
}
