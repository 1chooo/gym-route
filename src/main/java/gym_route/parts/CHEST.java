package gym_route.parts;

public enum CHEST implements MusclePart {
    CHEST("胸"),
    UPPER_CHEST("上胸"),
    LOWER_CHEST("下胸"),;
    
    private final String name;

    CHEST(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

