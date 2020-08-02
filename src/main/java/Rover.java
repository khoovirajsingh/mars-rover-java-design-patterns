public abstract class Rover {
    private final Coordinate coordinate;
    private final Direction direction;

    public Rover(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public abstract Rover move(Rover rover);
    public abstract Rover rotateRight(Rover rover);
    public abstract Rover rotateLeft(Rover rover);
}
