package gym_route.parts;

public enum CORE implements MusclePart {
    CORE("核心");

    private final String name;

    CORE(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
