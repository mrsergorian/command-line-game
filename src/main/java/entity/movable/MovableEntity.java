package entity.movable;

import entity.Entity;
import grid.Grid;
import grid.Tile;

public class MovableEntity extends Entity {
    public MovableEntity(int y, int x, Tile tile, Grid grid) {
        super(y, x, tile, grid);
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP -> move(y, x, --y, x);
            case DOWN -> move(y, x, ++y, x);
            case LEFT -> move(y, x, y, --x);
            case RIGHT -> move(y, x, y, ++x);
        }
    }

    /**
     * Move the entity from previousY and previousX to nextY and nextX.
     */
    private void move(int previousY, int previousX, int nextY, int nextX) {
        // Replace the tile at the previous position.
        grid.setTile(previousY, previousX, new Tile(Tile.Type.GROUND));
        // Set the tile at the next position.
        grid.setTile(nextY, nextX, tile);
    }

    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }
}
