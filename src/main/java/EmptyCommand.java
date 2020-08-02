public class EmptyCommand extends Command {
    private Direction direction;

    public EmptyCommand(Direction direction) {
        this.direction = direction;
    }

    @Override
    public Direction execute() {
        return direction;
    }
}
