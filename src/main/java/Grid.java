public class Grid {
    Coordinate move(Coordinate coordinate, Direction direction) {
        int y = coordinate.y();
        if (direction == Direction.NORTH) {
            y = (y + 1) % 10;
        }
        return new Coordinate(coordinate.x(), y);
    }
}
