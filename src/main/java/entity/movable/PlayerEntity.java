package entity.movable;

import grid.Grid;
import grid.Tile;
import lombok.NonNull;

public class PlayerEntity extends MovableEntity {
    public PlayerEntity(int y, int x, @NonNull Tile tile, @NonNull Grid grid) {
        super(y, x, tile, grid);
    }

    @Override
    public void move(@NonNull Direction direction) {
        switch (direction) {
            case UP -> {
                // Check if the next tile is a ground tile.
                if (grid.getTile(y - 1, x).isGround()) {
                    super.move(Direction.UP);
                }
            }
            case DOWN -> {
                if (grid.getTile(y + 1, x).isGround()) {
                    super.move(Direction.DOWN);
                }
            }
            case LEFT -> {
                if (grid.getTile(y, x - 1).isGround()) {
                    super.move(Direction.LEFT);
                }
            }
            case RIGHT -> {
                if (grid.getTile(y, x + 1).isGround()) {
                    super.move(Direction.RIGHT);
                }
            }
        }
    }
}
