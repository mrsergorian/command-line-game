package grid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
public class Tile {
    @Getter
    private @NonNull Type type;

    // Return the tile as a string based on its type.
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
