package gym_route.parts;

public enum BACK implements MusclePart {
    BACK("背"),
    ERECTOR_SPINAE("豎脊肌"),
    TRAPEZIUS("圓肌");
    
    private final String name;

    BACK(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

