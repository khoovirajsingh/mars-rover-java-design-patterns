public class LeftCommand extends Command {
    private Direction direction;

    public LeftCommand(Direction direction) {
        this.direction = direction;
    }

    @Override
    public Direction execute() {
        return direction.left();
    }
}
