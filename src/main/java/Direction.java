public enum Direction {
    NORTH("N", "W", "E"),
    EAST("E", "N", "S"),
    WEST("W", "S", "N"),
    SOUTH("S", "E", "W");

    private final String value;
    private final String left;
    private final String right;

    Direction(String value, String left, String right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Direction right() {
        return directionToThe(right);
    }

    public Direction left() {
        return directionToThe(left);
    }

    private Direction directionToThe(String value) {
        for (Direction direction : values()) {
            if (direction.value == value) {
                return direction;
            }
        }
        return null;
    }


    public String value() {
        return value;
    }
}

