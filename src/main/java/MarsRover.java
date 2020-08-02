public class MarsRover {
    Direction direction = Direction.NORTH;
    private int x =0;
    private int y = 0;
    private Coordinate coordinate = new Coordinate(0, 0);
    private Grid grid;

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {
        for (char command : commands.toCharArray()) {
            direction = Command.createCommand(command, direction).execute();
            if (command == 'M') {
                coordinate = grid.move(coordinate, direction);
            }
        }
        return coordinate.x() +":" + coordinate.y() + ":" + direction.value();
    }
}
