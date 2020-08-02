public class EastFacingRover extends Rover {
    private Coordinate coordinate;

    public EastFacingRover(Coordinate coordinate) {
        super(coordinate, Direction.EAST);
        this.coordinate = coordinate;
    }

    @Override
    public Rover move(Rover rover) {
        return new NorthFacingRover(coordinate);
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
