package entity.movable;

import entity.Entity;
import grid.Grid;
import grid.Tile;
import lombok.NonNull;

public class MovableEntity extends Entity {
    public MovableEntity(int y, int x, @NonNull Tile tile, @NonNull Grid grid) {
        super(y, x, tile, grid);
    }

    public void move(@NonNull Direction direction) {
        switch (direction) {
            case UP -> move(y, x, --y, x);
            case DOWN -> move(y, x, ++y, x);
            case LEFT -> move(y, x, y, --x);
            case RIGHT -> move(y, x, y, ++x);
        }
    }

    /**
     * Move the entity from oldY and oldX to newY and newX.
     */
    private void move(int oldY, int oldX, int newY, int newX) {
        // Replace the tile at the old position.
        grid.setTile(oldY, oldX, new Tile(Tile.Type.GROUND));
        // Set the tile at the new position.
        grid.setTile(newY, newX, tile);
    }

    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }
}
