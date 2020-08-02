public class NorthFacingRover extends Rover {
    private Coordinate coordinate;

    public NorthFacingRover(Coordinate coordinate) {
        super(coordinate, Direction.NORTH);
        this.coordinate = coordinate;
    }

    @Override
    public Rover move(Rover rover) {
        return new EastFacingRover(coordinate);
    }

    @Override
    public Rover rotateRight(Rover rover) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Rover rotateLeft(Rover rover) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
