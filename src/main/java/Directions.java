public enum Directions {
    NORTH("N"),
    EAST("E");

    private String value;

    Directions(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
