package grid;

public record Tile(Tile.Type type) {
    // Return the string representation of the tile based on its type.
    @Override
    public String toString() {
        switch (type) {
            case GROUND -> {
                return " ";
            }
            case WALL -> {
                return "#";
            }
        }
        return null;
    }

    public enum Type {
        GROUND, WALL
    }
}
