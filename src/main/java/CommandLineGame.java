import entity.movable.MovableEntity;
import entity.movable.PlayerEntity;
import grid.Grid;
import grid.GridGenerator;
import grid.Tile;

import java.util.Scanner;

public class CommandLineGame {
    private Grid grid;
    GridGenerator gridGenerator;
    private String input;
    private PlayerEntity player;

    public void run() {
        init();
        loop();
    }

    private void init() {
        grid = new Grid();
        gridGenerator = new GridGenerator(grid);
        gridGenerator.generate(); // Generate the grid.

        player = new PlayerEntity(grid.HEIGHT / 2, grid.WIDTH / 2,
                new Tile(Tile.Type.PLAYER), grid);
    }

    private void loop() {
        boolean isRunning = true;

        while (isRunning) { // Main game loop.
            grid.print();
            getInput();

            switch (input) {
                case "quit", "q" -> isRunning = false;
                case "up", "w" -> player.move(MovableEntity.Direction.UP);
                case "down", "s" -> player.move(MovableEntity.Direction.DOWN);
                case "left", "a" -> player.move(MovableEntity.Direction.LEFT);
                case "right", "d" -> player.move(MovableEntity.Direction.RIGHT);
                case "regenerate", "r" -> { // Regenerate the grid if the player is stuck.
                    gridGenerator.generate();
                    player.initTile();
                }
            }
        }
    }

    private void getInput() {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
    }
}
