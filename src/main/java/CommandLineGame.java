import grid.Grid;

public class CommandLineGame {
    private Grid grid;

    public void run() {
        init();
        update();
    }

    private void init() {
        grid = new Grid();
    }

    private void update() {
        grid.print();
    }
}
