public class RightCommand extends Command {
    private Direction direction;

    public RightCommand(Direction direction) {
        this.direction = direction;
    }

    @Override
    public Direction execute() {
        return direction.right();
    }
}
