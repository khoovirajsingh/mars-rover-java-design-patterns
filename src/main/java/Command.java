public abstract class Command {
    public abstract Direction execute();

    public static Command createCommand(char command, Direction direction) {
        if (command == 'R') return new RightCommand(direction);
        if (command == 'L') return new LeftCommand(direction);
        return new EmptyCommand(direction);
    }
}
