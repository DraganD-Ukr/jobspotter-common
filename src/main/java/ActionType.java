public enum ActionType {
    APPLY("Apply"),
    VIEW("View"),
    EDIT("Edit"),
    RATE("Rate"),
    SEARCH("Search");

    private final String description;

    ActionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
