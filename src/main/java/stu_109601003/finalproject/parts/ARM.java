package stu_109601003.finalproject.parts;

public enum ARM implements MusclePart {
    ARM("手臂"),
    BICEPS("肱二頭"),
    TRICEPS("肱三頭");

    private final String name;

    ARM(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

