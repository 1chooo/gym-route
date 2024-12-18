package stu_109601003.finalproject.parts;

public enum SHOULDER implements MusclePart {
    SHOULDER("肩"),
    FRONT_DELTOID("前束"),
    MIDDLE_DELTOID("中束"),
    REAR_DELTOID("後束"),
    TRAPEZIUS("斜方肌"),;

    private final String name;

    SHOULDER(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
