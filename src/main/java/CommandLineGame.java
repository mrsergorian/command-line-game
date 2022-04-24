import entity.movable.MovableEntity;
import entity.movable.PlayerEntity;
import grid.Grid;
import grid.Tile;

import java.util.Scanner;

public class CommandLineGame {
    private Grid grid;
    private String input;
    private PlayerEntity player;

    public void run() {
        init();
        loop();
    }

    private void init() {
        grid = new Grid();
        player = new PlayerEntity(grid.HEIGHT / 2, grid.WIDTH / 2,
                new Tile(Tile.Type.PLAYER), grid);
    }

    private void loop() {
        boolean isRunning = true;

        while (isRunning) {
            grid.print();
            getInput();

            switch (input) {
                case "q" -> isRunning = false; // Quit the game.
                case "w" -> player.move(MovableEntity.Direction.UP);
                case "s" -> player.move(MovableEntity.Direction.DOWN);
                case "a" -> player.move(MovableEntity.Direction.LEFT);
                case "d" -> player.move(MovableEntity.Direction.RIGHT);
            }
        }
    }

    private void getInput() {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
    }
}
