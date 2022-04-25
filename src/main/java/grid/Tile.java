package grid;

public record Tile(Type type) {
    /**
     * Return the string representation of the tile based on its type.
     */
    @Override
    public String toString() {
        switch (type) {
            case GROUND -> {
                return " ";
            }
            case WALL -> {
                return "#";
            }
            case PLAYER -> {
                return "$";
            }
        }
        return null;
    }

    /**
     * Returns true if the tile is a ground tile and false if it's
     * not.
     */
    public boolean isGround() {
        return type == Type.GROUND;
    }

    public enum Type {
        GROUND, WALL, PLAYER
    }
}
